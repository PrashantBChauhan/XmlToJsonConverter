package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class RemittanceInformationTest {
	
	@InjectMocks
	RemittanceInformation remittanceInformation;
	
	@BeforeEach
	void setUp() {
		remittanceInformation = new RemittanceInformation();
	}
	
	@Test
	void testGetAndSetUstrd() {
		String testUstrd = "Invoice 12345";
		remittanceInformation.setUstrd(testUstrd);
		Assertions.assertEquals(testUstrd, remittanceInformation.getUstrd());
	}

}
