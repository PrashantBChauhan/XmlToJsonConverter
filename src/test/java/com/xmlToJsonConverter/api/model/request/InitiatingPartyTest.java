package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class InitiatingPartyTest {
	@InjectMocks
	InitiatingParty initiatingParty;
	
	@BeforeEach
	void setUp() {
		initiatingParty = new InitiatingParty();
		initiatingParty.setNm("John Doe");
	}
	
	@Test
	void testInitiatingParty() {	
		
		Assertions.assertEquals("John Doe", initiatingParty.getNm());
		
	}

}
