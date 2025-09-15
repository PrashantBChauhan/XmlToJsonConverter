package com.xmlToJsonConverter.api.model.request;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class PaymentInformationTest {
	
	@InjectMocks
	PaymentInformation paymentInformation;
	
	@Mock
	PaymentTypepInformation pmtTpInf;
	
	@Mock
	ServiceLevel servicLevel;
	
	@Mock
	DebtorName debtorName;
	
	@Mock
	DebtorAccountId debtorAccountId;
	
	@Mock
	DebtorAccountDetails debtorAccountDetails;
	
	@Mock
	FinancialInstitutionIdentification financialInstitutionIdentification;
	
	@Mock
	DebtorAgent debtorAgent;
	
	@Mock
	CreditTransferTransactionInformation cdtTrfTxInf;
	
	@Mock
	PaymentId paymentId;
	
	@Mock
	Amount amount;
	
	@Mock
	CreditorAgent creditorAgent;
	
	@Mock
	CreditorName creditorName;
	
	@Mock
	CreditorAccount creditorAccount;
	
	@Mock
	RemittanceInformation rmtInf;
	
	@BeforeEach
	void setUp() {
		debtorName = new DebtorName();
		debtorName.setNm("John Doe");
		
		paymentInformation = new PaymentInformation();
		paymentInformation.setPmtInfId("PMT123");
		paymentInformation.setPmtMtd("TRF");
		paymentInformation.setNbOfTxs("5");
		paymentInformation.setCtrlSum("1000.00");
		paymentInformation.setReqdExctnDt("2024-06-02");
		paymentInformation.setDbtr(debtorName);
		
		servicLevel = new ServiceLevel();
		servicLevel.setCd("SEPA");
		
		pmtTpInf = new PaymentTypepInformation();
		pmtTpInf.setSvcLvl(servicLevel);
		
		debtorAccountId = new DebtorAccountId();
		debtorAccountId.setIBAN("DE89370400440532013000");
		
		debtorAccountDetails = new DebtorAccountDetails();
		debtorAccountDetails.setId(debtorAccountId);
		
		financialInstitutionIdentification = new FinancialInstitutionIdentification();
		financialInstitutionIdentification.setBic("DEUTDEFF");
		
		debtorAgent = new DebtorAgent();
		debtorAgent.setFinInstnId(financialInstitutionIdentification);
		
		paymentId = new PaymentId();
		amount = new Amount();
		creditorAgent = new CreditorAgent();
		creditorName = new CreditorName();
		creditorAccount = new CreditorAccount();
		rmtInf = new RemittanceInformation();
		
		cdtTrfTxInf = new CreditTransferTransactionInformation();
		cdtTrfTxInf.setAmt(amount);
		cdtTrfTxInf.setCdtr(creditorName);
		cdtTrfTxInf.setCdtrAcct(creditorAccount);
		cdtTrfTxInf.setCdtrAgt(creditorAgent);
		cdtTrfTxInf.setPmtId(paymentId);
		cdtTrfTxInf.setRmtInf(rmtInf);
		
		
	}
	
	@Test
	void testPaymentInformationSetup() {
		
		Assertions.assertNotNull(paymentInformation);
		Assertions.assertEquals("PMT123", paymentInformation.getPmtInfId());
		Assertions.assertEquals("TRF", paymentInformation.getPmtMtd());
		Assertions.assertEquals("5", paymentInformation.getNbOfTxs());
		Assertions.assertEquals("1000.00", paymentInformation.getCtrlSum());
		Assertions.assertEquals("2024-06-02", paymentInformation.getReqdExctnDt());
		Assertions.assertEquals("John Doe", paymentInformation.getDbtr().getNm());
		Assertions.assertNotNull(pmtTpInf);
		Assertions.assertEquals("SEPA", pmtTpInf.getSvcLvl().getCd());
		Assertions.assertNotNull(debtorAccountDetails);
		Assertions.assertEquals("DE89370400440532013000", debtorAccountDetails.getId().getIBAN());
		Assertions.assertNotNull(debtorAgent);
		Assertions.assertEquals("DEUTDEFF", debtorAgent.getFinInstnId().getBic());
		Assertions.assertNotNull(cdtTrfTxInf);
		Assertions.assertEquals(amount, cdtTrfTxInf.getAmt());
		Assertions.assertEquals(creditorName, cdtTrfTxInf.getCdtr());
		Assertions.assertEquals(creditorAccount, cdtTrfTxInf.getCdtrAcct());
		Assertions.assertEquals(creditorAgent, cdtTrfTxInf.getCdtrAgt());
		Assertions.assertEquals(paymentId, cdtTrfTxInf.getPmtId());
		Assertions.assertEquals(rmtInf, cdtTrfTxInf.getRmtInf());
		Assertions.assertNull(paymentInformation.getPmtTpInf());
		Assertions.assertNull(paymentInformation.getDbtrAcct());
		Assertions.assertNull(paymentInformation.getDbtrAgt());
		Assertions.assertNull(paymentInformation.getCdtTrfTxInf());
		
		
		
		
	}
	
}
