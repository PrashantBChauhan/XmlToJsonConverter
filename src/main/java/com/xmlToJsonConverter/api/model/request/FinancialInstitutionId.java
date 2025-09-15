package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

class FinancialInstitutionId {
	
	@JacksonXmlProperty(localName = "BIC")
	private String bic;
	
	public String getBic() {
		return bic;
	}
	
	public void setBic(String bic) {
		this.bic = bic;
	}
}
