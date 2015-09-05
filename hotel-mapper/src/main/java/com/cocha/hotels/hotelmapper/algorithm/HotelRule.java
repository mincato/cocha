package com.cocha.hotels.hotelmapper.algorithm;

import com.cocha.hotels.model.content.hotel.Hotel;

public interface HotelRule {

    RuleMatch apply(Hotel eanHotel, Hotel bookingHotel);

}
