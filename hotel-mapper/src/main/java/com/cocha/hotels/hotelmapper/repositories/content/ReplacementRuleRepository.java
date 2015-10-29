package com.cocha.hotels.hotelmapper.repositories.content;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cocha.hotels.model.hotelmapper.dictionary.ReplacementRule;

public interface ReplacementRuleRepository extends CrudRepository<ReplacementRule, Long> {

    public List<ReplacementRule> findByCountryCodeOrCountryCodeIsNull(String countryCode);

}
