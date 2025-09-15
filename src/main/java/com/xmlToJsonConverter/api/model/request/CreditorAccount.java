package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CreditorAccount {
	
	@JacksonXmlProperty(localName = "Id")
	private CreditorAccountId id;
	
	public CreditorAccountId getId() {
		return id;
	}
	
	public void setId(CreditorAccountId id) {
		this.id = id;
	}

}
