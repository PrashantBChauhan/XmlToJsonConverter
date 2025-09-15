package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class DebtorAgentTest {
	
	@InjectMocks
	DebtorAgent debtorAgent;
	
	@Mock
	FinancialInstitutionIdentification finInstnId;
	
	@BeforeEach
	void setUp() {
		debtorAgent = new DebtorAgent();
		finInstnId = new FinancialInstitutionIdentification();
		debtorAgent.setFinInstnId(finInstnId);
	}
	
	@Test
	void testDebtorAgent() {	
		Assertions.assertEquals(finInstnId, debtorAgent.getFinInstnId());
	}
	
}
