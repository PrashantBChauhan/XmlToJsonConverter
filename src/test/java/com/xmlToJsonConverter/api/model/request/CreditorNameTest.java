package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class CreditorNameTest {
	
	@InjectMocks
	CreditorName creditorName;
	
	@BeforeEach
	public void setUp() {
		creditorName = new CreditorName();
		creditorName.setNm("John Doe");
	}
	
	@Test
	void testCreditorName() {
		Assertions.assertNotNull(creditorName);
		Assertions.assertEquals("John Doe", creditorName.getNm());
	}

}
