package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class PaymentIdTest {
	@InjectMocks
	PaymentId paymentId;
	
	@BeforeEach
	void setUp() {
		paymentId = new PaymentId();
		paymentId.setEndToEndId("E2E123");
	}
	
	@Test
	void testPaymentId() {	
		Assertions.assertEquals("E2E123", paymentId.getEndToEndId());
	}
	
}
