package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class GroupHeaderTest {
	@InjectMocks
	GroupHeader groupHeader;
	
	@BeforeEach
	void setUp() {
		groupHeader = new GroupHeader();
		groupHeader.setMsgId("MSG12345");
		groupHeader.setCreDtTm("2024-10-01T10:00:00");
		groupHeader.setNbOfTxs("5");
		groupHeader.setCtrlSum("1000.00");
	}
	
	@Test
	void testGroupHeader() {	
		Assertions.assertEquals("MSG12345", groupHeader.getMsgId());
		Assertions.assertEquals("2024-10-01T10:00:00", groupHeader.getCreDtTm());
		Assertions.assertEquals("5", groupHeader.getNbOfTxs());
		Assertions.assertEquals("1000.00", groupHeader.getCtrlSum());
	}
}
