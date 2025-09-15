package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class FinancialInstitutionIdentification {
	
	@JacksonXmlProperty(localName = "BIC")
	private String bic;
	
	public String getBic() {
		return bic;
	}
	
	public void setBic(String bic) {
		this.bic = bic;
	}
}
