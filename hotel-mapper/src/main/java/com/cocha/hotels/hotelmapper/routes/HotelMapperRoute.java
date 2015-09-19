package com.cocha.hotels.hotelmapper.routes;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.hotelmapper.repositories.HotelRepository;

@Component
public class HotelMapperRoute extends SpringRouteBuilder {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public void configure() throws Exception {

		from("quartz2://mapper?trigger.repeatCount=1")
				.errorHandler(loggingErrorHandler(log))
				.to("sql:select distinct(countryCode) from Hotel?dataSource=#dataSource").split(body())
				.transform().simple("${body[countryCode]}")
				.bean(hotelRepository, "findByCountryCode")
				.beanRef("mapperProcessor");

		from("direct:hotels").pollEnrich("sql:select distinct(countryCode) from Hotel?dataSource=#dataSource")
			.log(body().toString())
			.transform().simple("${body[countryCode]}")
			.bean(hotelRepository, "findByCountryCode");
	}

}
