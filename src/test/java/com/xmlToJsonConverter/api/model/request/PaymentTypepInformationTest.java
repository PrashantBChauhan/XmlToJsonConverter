package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class PaymentTypepInformationTest {
	@InjectMocks
	PaymentTypepInformation paymentTypepInformation;
	
	@Mock
	ServiceLevel svcLvl;
	
	@BeforeEach
	void setUp() {
		paymentTypepInformation = new PaymentTypepInformation();
		svcLvl = new ServiceLevel();
		svcLvl.setCd("SEPA");
		paymentTypepInformation.setSvcLvl(svcLvl);
	}
	
	@Test
	void testPaymentTypepInformation() {	
		Assertions.assertEquals("SEPA", paymentTypepInformation.getSvcLvl().getCd());
	}
	
}
