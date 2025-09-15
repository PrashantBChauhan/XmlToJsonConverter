package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DebtorAccountDetails {
	
	@JacksonXmlProperty(localName = "Id")
	private DebtorAccountId id;
	
	public DebtorAccountId getId() {
		return id;
	}
	
	public void setId(DebtorAccountId id) {
		this.id = id;
	}
	
}
