package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class ServiceLevelTest {
	
	@InjectMocks
	ServiceLevel serviceLevel;
	
	@BeforeEach
	void setUp() {
		serviceLevel = new ServiceLevel();
		serviceLevel.setCd("SEPA");
	}
	
	@Test
	void testServiceLevel() {	
		Assertions.assertEquals("SEPA", serviceLevel.getCd());
	}
	
	
	
}
