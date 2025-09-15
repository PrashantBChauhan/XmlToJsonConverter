package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DebtorAgent {
	
	@JacksonXmlProperty(localName = "FinInstnId")
	private FinancialInstitutionIdentification finInstnId;

	public FinancialInstitutionIdentification getFinInstnId() {
		return finInstnId;
	}

	public void setFinInstnId(FinancialInstitutionIdentification finInstnId) {
		this.finInstnId = finInstnId;
	}
}
