package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class AmountTest {
	@InjectMocks
	Amount amount;
	
	@BeforeEach
	void setUp() throws Exception {
		amount = new Amount();
		amount.setInstdAmt("100");
	}
	
	@Test
	void testAmount() {
		Assertions.assertEquals("100", amount.getInstdAmt());
	}

}
