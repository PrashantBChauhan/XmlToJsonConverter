package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class CreditorAccountTest {
	@InjectMocks
	CreditorAccount creditorAccount;
	
	@Mock
	CreditorAccountId creditorAccountId;
	
	@BeforeEach
	void setUp() throws Exception {
		creditorAccount = new CreditorAccount();
		creditorAccountId = new CreditorAccountId();
		creditorAccountId.setIban("DE89370400440532013000");
		creditorAccount.setId(creditorAccountId);
	}
	
	@Test
	void testCreditorAccount() {
		Assertions.assertNotNull(creditorAccount);
		Assertions.assertEquals(creditorAccountId, creditorAccount.getId());
		
	}
}
