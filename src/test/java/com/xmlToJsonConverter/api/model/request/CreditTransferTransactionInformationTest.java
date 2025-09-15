package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class CreditTransferTransactionInformationTest {
	
	@InjectMocks
	CreditTransferTransactionInformation ctti;
	
	@Mock
	PaymentId pmtId;
	
	@Mock
	Amount amt;
	
	@Mock
	CreditorAgent cdtrAgt;
	
	@Mock
	CreditorName cdtr;
	
	@Mock
	CreditorAccount cdtrAcct;
	
	@Mock
	RemittanceInformation rmtInf;
	
	@BeforeEach
	public void setUp() {
		ctti = new CreditTransferTransactionInformation();
		ctti.setPmtId(pmtId);
		ctti.setAmt(amt);
		ctti.setCdtrAgt(cdtrAgt);
		ctti.setCdtr(cdtr);
		ctti.setCdtrAcct(cdtrAcct);
		ctti.setRmtInf(rmtInf);
	}
	
	@Test
	void testCreditTransferTransactionInformation() {
		Assertions.assertNotNull(ctti);
		Assertions.assertEquals(pmtId, ctti.getPmtId());
		Assertions.assertEquals(amt, ctti.getAmt());
		Assertions.assertEquals(cdtrAgt, ctti.getCdtrAgt());
		Assertions.assertEquals(cdtr, ctti.getCdtr());
		Assertions.assertEquals(cdtrAcct, ctti.getCdtrAcct());
		Assertions.assertEquals(rmtInf, ctti.getRmtInf());
		
		
	}
}
