package com.xmlToJsonConverter.api.model.request;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class FinancialInstitutionIdentificationTest {

	@InjectMocks
	FinancialInstitutionIdentification financialInstitutionIdentification;
	
	@BeforeEach
	void setUp() {
		financialInstitutionIdentification = new FinancialInstitutionIdentification();
		financialInstitutionIdentification.setBic("DEUTDEFF");
	}
	
	@Test
	void testFinancialInstitutionIdentification() {	
		Assertions.assertEquals("DEUTDEFF", financialInstitutionIdentification.getBic());
	}
	
}
