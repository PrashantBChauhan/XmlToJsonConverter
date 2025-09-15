package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CreditTransferTransactionInformation {
	
	@JacksonXmlProperty(localName = "PmtId")
	private PaymentId pmtId;
	
	@JacksonXmlProperty(localName = "Amt")
	private Amount amt;
	
	@JacksonXmlProperty(localName = "CdtrAgt")
	private CreditorAgent cdtrAgt;
	
	@JacksonXmlProperty(localName = "Cdtr")
	private CreditorName cdtr;
	
	@JacksonXmlProperty(localName = "CdtrAcct")
	private CreditorAccount cdtrAcct;
	
	@JacksonXmlProperty(localName = "RmtInf")
	private RemittanceInformation rmtInf;
	
	public PaymentId getPmtId() {
		return pmtId;
	}

	public void setPmtId(PaymentId pmtId) {
		this.pmtId = pmtId;
	}
	
	public Amount getAmt() {
		return amt;
	}
	
	public void setAmt(Amount amt) {
		this.amt = amt;
	}
	
	public CreditorAgent getCdtrAgt() {
		return cdtrAgt;
	}
	
	public void setCdtrAgt(CreditorAgent cdtrAgt) {
		this.cdtrAgt = cdtrAgt;
	}
	
	public CreditorName getCdtr() {
		return cdtr;
	}
	
	public void setCdtr(CreditorName cdtr) {
		this.cdtr = cdtr;
	}
	
	public CreditorAccount getCdtrAcct() {
		return cdtrAcct;
	}
	
	public void setCdtrAcct(CreditorAccount cdtrAcct) {
		this.cdtrAcct = cdtrAcct;
	}
	
	public RemittanceInformation getRmtInf() {
		return rmtInf;
	}
	
	public void setRmtInf(RemittanceInformation rmtInf) {
		this.rmtInf = rmtInf;
	}
	
}
