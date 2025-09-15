package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class DebtorAccountDetailsTest {

	@InjectMocks
	DebtorAccountDetails dad;
	
	@Mock
	DebtorAccountId id;
	
	@BeforeEach
	void setUp() {
		dad = new DebtorAccountDetails();
		dad.setId(id);
	}
	
	@Test
	void testDebtorAccountDetails() {
		Assertions.assertNotNull(dad);
		Assertions.assertEquals(id, dad.getId());
	}
}
