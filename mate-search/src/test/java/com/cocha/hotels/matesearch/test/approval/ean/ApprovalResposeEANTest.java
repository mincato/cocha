package com.cocha.hotels.matesearch.test.approval.ean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.cocha.hotels.matesearch.providers.processors.ApprovalResposeEAN;

public class ApprovalResposeEANTest{
	
	public static final Logger log = Logger.getLogger(ApprovalResposeEANTest.class);
	
	@SuppressWarnings("unused")
	@Test
	public void approvalTest() throws Exception {
		
		String stringEjemplo = "\"HotelSummary\":{CAMPO1:{aaaaa}}";
		String stringRespuestaHomologada = "\"HotelSummary\":[{CAMPO1:{aaaaa}}]";
		String StringCortado = "\"HotelSummary\":";
		String llave = "{";
		
        final InputStream resource = getClass().getClassLoader().getResourceAsStream("respuestamocks/ResponseHotelSupplierEANEjemplo.json");
        final InputStream jsonHomologadoInputStream = getClass().getClassLoader().getResourceAsStream("respuestamocks/ResponseHotelSupplierEANHomologada.json");
		
//        final InputStream resource = getClass().getClassLoader().getResourceAsStream("respuestamocks/sin.json");
//        final InputStream jsonHomologadoInputStream = getClass().getClassLoader().getResourceAsStream("respuestamocks/con.json");
        
        String jsonTest = getStringFromInputStream(resource);
        String jsonHomologado = getStringFromInputStream(jsonHomologadoInputStream);
		
        jsonHomologado=jsonHomologado.replaceAll(" ", "");
        
		ApprovalResposeEAN approvalResposeEAN = new ApprovalResposeEAN();
		String stringRepuestaParser = approvalResposeEAN.approvalRespose(jsonTest);
		
		log.info(stringRepuestaParser);
		log.info(jsonHomologado);
		Assert.assertEquals(jsonHomologado, stringRepuestaParser);
		
	}
	
	
	private static String getStringFromInputStream(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}

}
