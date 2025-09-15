package com.xmlToJsonConverter.api.model.request;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class CustomerCreditTransferInitiationTest {
	
	@InjectMocks
	CustomerCreditTransferInitiation customerCreditTransferInitiation;
	
	@Mock
	GroupHeader grpHdr;
	
	@Mock
	PaymentInformation pmtInf;
	
	@Mock
	List<PaymentInformation> pmtInfList;
	
	@Mock
	InitiatingParty initgPty;
	
	@BeforeEach
	void setUp() {
		customerCreditTransferInitiation = new CustomerCreditTransferInitiation();
		grpHdr = new GroupHeader();
		grpHdr.setMsgId("TestMsgId");
		grpHdr.setCreDtTm("2024-10-10T10:10:10");
		grpHdr.setNbOfTxs("5");
		grpHdr.setCtrlSum("1000.00");
		initgPty = new InitiatingParty();
		
		initgPty.setNm("TestInitiatingParty");
		grpHdr.setInitgPty(initgPty);
		
		pmtInf = new PaymentInformation();
		pmtInfList = List.of(pmtInf);
		pmtInf.setPmtInfId("TestPmtInfId");
		customerCreditTransferInitiation.setPmtInf(pmtInfList);
		customerCreditTransferInitiation.setGrpHdr(grpHdr);
		
	}
	
	@Test
	void testGetAndSetPmtInfId() {
		Assertions.assertEquals("TestMsgId", customerCreditTransferInitiation.getGrpHdr().getMsgId());
		Assertions.assertEquals("2024-10-10T10:10:10", customerCreditTransferInitiation.getGrpHdr().getCreDtTm());
		Assertions.assertEquals("5", customerCreditTransferInitiation.getGrpHdr().getNbOfTxs());
		Assertions.assertEquals("1000.00", customerCreditTransferInitiation.getGrpHdr().getCtrlSum());
		Assertions.assertEquals("TestInitiatingParty", customerCreditTransferInitiation.getGrpHdr().getInitgPty().getNm());
		Assertions.assertNotNull(customerCreditTransferInitiation.getPmtInf());
		Assertions.assertEquals("TestPmtInfId", customerCreditTransferInitiation.getPmtInf().get(0).getPmtInfId());
	}

}
