package com.cocha.hotels.matesearch.util;

public class Constant {

    public static final String CURRNCY_DEFAULT = "USD";
    public static final String ID_HOTEL = "idHotel";
    public static final String SUPPLIER = "supplier";
    public static final String REGION_ID = "regionId";
    public static final String ARRIVAL_DATE = "arrivalDate";
    public static final String DEPARTURE_DATE = "departureDate";
    public static final String CURRENCY_CODE = "currencyCode";

    public static final String HOTEL_IDS_SEPARATOR = ",";

    public interface CodeSupplier {

        public static final String BOOKING_SUPPLIER_CODE = "BKG";
        public static final String BOOKING_SUPPLIER_ID_HOTEL = "idHotelBooking";
        public static final String EAN_SUPPLIER_CODE = "EAN";
        public static final String EAN_SUPPLIER_ID_HOTEL = "idHotelEan";
        public static final String SABRE_SUPPLIER_CODE = "SAB";
        public static final String SABRE_SUPPLIER_ID_HOTEL = "idsHotelsSabre";
    }
    
    public interface SabreSecurityToken {
    	
    	public static final String DESTINATION_IP = "InputOpenSabreSession";
    	public static final String DESTINATION_OP = "OutputOpenSabreSession";
    	public static final String HOST = "hub-qa";
    	public static final String PORT = "5445";
    	
    }
}
