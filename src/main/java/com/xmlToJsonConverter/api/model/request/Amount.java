package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Amount {
	
	@JacksonXmlProperty(localName = "InstdAmt")
	private String instdAmt;

	public String getInstdAmt() {
		return instdAmt;
	}

	public void setInstdAmt(String instdAmt) {
		this.instdAmt = instdAmt;
	}

}
