package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class CreditorAgentTest {
	
	@InjectMocks
	CreditorAgent creditorAgent;
	
	@Mock
	FinancialInstitutionId finInstnId;
	
	@BeforeEach
	void setUp() throws Exception {
		creditorAgent = new CreditorAgent();
		finInstnId = new FinancialInstitutionId();
		finInstnId.setBic("DEUTDEFF");
		creditorAgent.setFinInstnId(finInstnId);
	}
	
	@Test
	void testCreditorAgent() {
		Assertions.assertNotNull(creditorAgent);
		Assertions.assertEquals(finInstnId, creditorAgent.getFinInstnId());
	}


}
