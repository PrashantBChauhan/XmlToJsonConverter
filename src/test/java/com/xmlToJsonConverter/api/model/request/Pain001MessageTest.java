package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class Pain001MessageTest {

	@InjectMocks
	Pain001Message pain001Message;

	@Mock
	CustomerCreditTransferInitiation cstmrCdtTrfInitn;
	
	@BeforeEach
	void setUp() {
		pain001Message = new Pain001Message();
		cstmrCdtTrfInitn = new CustomerCreditTransferInitiation();
	}
	
	@Test
	void testPain001Message() {	
		pain001Message.setCstmrCdtTrfInitn(cstmrCdtTrfInitn);
		Assertions.assertEquals(cstmrCdtTrfInitn, pain001Message.getCstmrCdtTrfInitn());
		
	}
	
}
