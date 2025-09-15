package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DebtorAccountId {
	
	@JacksonXmlProperty(localName = "IBAN")
	private String iban;
	
	public String getIBAN() {
		return iban;
	}
	
	public void setIBAN(String iban) {
		this.iban = iban;
	}
}
