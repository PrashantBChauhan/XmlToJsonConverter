package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class DebtorNameTest {
	@InjectMocks
	DebtorName debtorName;
	
	@BeforeEach
	void setUp() {
		debtorName = new DebtorName();
		debtorName.setNm("John Doe");
	}
	
	@Test
	void testDebtorName() {	
		Assertions.assertEquals("John Doe", debtorName.getNm());
	}
	
	
}
