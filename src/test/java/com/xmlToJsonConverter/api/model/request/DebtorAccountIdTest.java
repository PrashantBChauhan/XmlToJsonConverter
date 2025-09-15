package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class DebtorAccountIdTest {
	
	@InjectMocks
	DebtorAccountId	 debtorAccountId;
	
	@BeforeEach
	void setUp() {
		debtorAccountId = new DebtorAccountId();
		debtorAccountId.setIBAN("DE89370400440532013000");
	}
	
	@Test
	void testDebtorAccountId() {	

		Assertions.assertEquals("DE89370400440532013000", debtorAccountId.getIBAN());
		
	}
	
}
