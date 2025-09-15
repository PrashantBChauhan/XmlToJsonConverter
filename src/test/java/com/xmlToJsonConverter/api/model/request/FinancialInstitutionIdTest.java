package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class FinancialInstitutionIdTest {

	@InjectMocks
	FinancialInstitutionId financialInstitutionId;
	
	@BeforeEach
	void setUp() {
		financialInstitutionId = new FinancialInstitutionId();
		financialInstitutionId.setBic("DEUTDEFF");
	}

	@Test
	void testFinancialInstitutionId() {	
		Assertions.assertEquals("DEUTDEFF", financialInstitutionId.getBic());
	}
	
}
