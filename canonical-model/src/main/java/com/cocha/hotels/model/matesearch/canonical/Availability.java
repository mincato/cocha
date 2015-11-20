package com.cocha.hotels.model.matesearch.canonical;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({ RateInfoForSupplier.class, ErrorSupplier.class })
public abstract class Availability implements Serializable {

}
