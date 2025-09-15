package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DebtorName {
	
	@JacksonXmlProperty(localName = "Nm")
	private String nm;

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}
}
