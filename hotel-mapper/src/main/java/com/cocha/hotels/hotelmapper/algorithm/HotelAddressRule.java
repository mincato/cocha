package com.cocha.hotels.hotelmapper.algorithm;

import java.util.Arrays;
import java.util.List;

import com.cocha.hotels.model.content.hotel.Hotel;


public class HotelAddressRule implements HotelRule {

    @Override
    public RuleMatch apply(Hotel reference, Hotel toCompare) {
        // obtener atributos, uniformizarlos, compararlos
        String nameReference = flatten(reference.getAddress());
        String nameToCompare = flatten(toCompare.getAddress());
        return compare(nameReference, nameToCompare);
    }

    private RuleMatch compare(String attrReference, String attrToCompare) {
        if (attrReference.compareTo(attrToCompare) == 0) {
            return new HotelRuleMatch(35);
        }
        
        List<String> refWords = Arrays.asList(attrReference.split("\\s+"));
        List<String> compWords = Arrays.asList(attrReference.split("\\s+"));
        
        boolean comparison = compare(refWords, compWords);
        Integer confidence = comparison ? 35 : 0;
        return new HotelRuleMatch(confidence);
    }
    
    private boolean compare(List<String> refWords, List<String> compWords) {
        
        //las palabras de uno contienen al otro
        return compWords.containsAll(refWords) || refWords.containsAll(compWords);
    }

    private String flatten(String name) {
        // primer paso, todo el mayusculas, remuevo los espacios
        // TODO refactor: parametrizar esto!
        return name.toUpperCase()
                .replace("SOUTH", "S")
                .replace("WEST", "W")
                .replace("STREET", "ST")
                .replace("AVENUE", "AVE")
                .replace("ROAD", "RD")
                .replace("DRIVE", "DR")
                .replace("HIGHWAY", "HWY")
                .replaceAll("[\\s\\.]", "");
    }

}
