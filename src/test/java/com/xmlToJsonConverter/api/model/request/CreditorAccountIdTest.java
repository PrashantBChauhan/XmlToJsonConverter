package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class CreditorAccountIdTest {

	@InjectMocks
	CreditorAccountId creditorAccountId;
	
	@BeforeEach
	void setUp() {
		creditorAccountId = new CreditorAccountId();
		creditorAccountId.setIban("FR7630006000011234567890189");
		
	}
	
	@Test
	void testCreditorAccountId() {
		Assertions.assertEquals("FR7630006000011234567890189", creditorAccountId.getIban());
	}
	
}
