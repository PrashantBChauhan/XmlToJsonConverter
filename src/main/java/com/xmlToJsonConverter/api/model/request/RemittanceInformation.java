package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RemittanceInformation {
	
	@JacksonXmlProperty(localName = "Ustrd")
	private String ustrd;

	public String getUstrd() {
		return ustrd;
	}

	public void setUstrd(String ustrd) {
		this.ustrd = ustrd;
	}
	
}
