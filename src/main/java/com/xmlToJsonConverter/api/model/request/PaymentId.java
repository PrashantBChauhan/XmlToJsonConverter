package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PaymentId {
	
	@JacksonXmlProperty(localName = "EndToEndId")
	private String endToEndId;

	public String getEndToEndId() {
		return endToEndId;
	}

	public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
	}
}
