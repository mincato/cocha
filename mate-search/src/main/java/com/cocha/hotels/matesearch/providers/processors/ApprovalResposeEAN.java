package com.cocha.hotels.matesearch.providers.processors;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ApprovalResposeEAN {

    public static final Logger log = Logger.getLogger(ApprovalResposeEAN.class);

    public static final String ANCHOR_STRING = "\"HotelSummary\":";
    public static final String KEY_OPEN = "{";
    public static final String KEY_CLOSE = "}";

    public String approvalRespose(String stringRespose) {

        stringRespose = stringRespose.replaceAll(" ", "");

        int insertStar;
        int insertEnd;
        int depth;
        int index = 0;
        int indexKeyClose = 0;
        int indexKeyOpen;
        int indexStart = stringRespose.indexOf(ANCHOR_STRING);
        if(indexStart != -1) {
        	int indexEnd = this.indexOfEnd(indexStart, stringRespose);
        	
        	if (KEY_OPEN.equals(stringRespose.substring(indexEnd, indexEnd + 1))) {
        		
        		insertStar = indexEnd;
        		index = ++indexEnd;
        		depth = 0;
        		
        		do {
        			indexKeyClose = stringRespose.indexOf(KEY_CLOSE, index);
        			indexKeyOpen = stringRespose.indexOf(KEY_OPEN, index);
        			
        			if (indexKeyClose < indexKeyOpen || indexKeyOpen == -1) {
        				depth--;
        				index = ++indexKeyClose;
        				if (stringRespose.indexOf(KEY_CLOSE, indexKeyClose + 1) != -1 && indexKeyOpen == -1) {
        					indexKeyClose = stringRespose.indexOf(KEY_CLOSE, indexKeyClose + 1);
        				}
        			} else {
        				depth++;
        				index = ++indexKeyOpen;
        			}
        		} while (depth > 0);
        		
        		insertEnd = indexKeyClose;
        		
        		stringRespose = new StringBuilder(stringRespose).insert(insertEnd, "]").insert(insertStar, "[").toString();
        	}        	
        }
        return stringRespose;
    }

    private int indexOfEnd(int indexStart, String stringRespose) {

        String[] subString = stringRespose.substring(indexStart).split("[\\{ \\[ ]");

        return subString[0].length() + indexStart;
    }

}
