package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PaymentTypepInformation {
	
	@JacksonXmlProperty(localName = "SvcLvl")
    private ServiceLevel svcLvl;

	public ServiceLevel getSvcLvl() {
		return svcLvl;
	}
	
	public void setSvcLvl(ServiceLevel svcLvl) {
		this.svcLvl = svcLvl;
	}
}
