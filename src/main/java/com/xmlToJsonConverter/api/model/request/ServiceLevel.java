package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ServiceLevel {
	@JacksonXmlProperty(localName = "Cd")
	private String cd;
	
	public String getCd() {
		return cd;
	}
	
	public void setCd(String cd) {
		this.cd = cd;
	}
}
