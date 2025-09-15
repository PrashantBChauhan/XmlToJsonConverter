package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CreditorAgent {
	
	@JacksonXmlProperty(localName = "FinInstnId")
	private FinancialInstitutionId finInstnId;

	public FinancialInstitutionId getFinInstnId() {
		return finInstnId;
	}

	public void setFinInstnId(FinancialInstitutionId finInstnId) {
		this.finInstnId = finInstnId;
	}
	
	
}
