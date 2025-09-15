// GroupHeader.java
package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GroupHeader {
    @JacksonXmlProperty(localName = "MsgId")
    private String msgId;

    @JacksonXmlProperty(localName = "CreDtTm")
    private String creDtTm;
    
    @JacksonXmlProperty(localName = "NbOfTxs")
    private String nbOfTxs;
    
    @JacksonXmlProperty(localName = "CtrlSum")
    private String ctrlSum;
    
    @JacksonXmlProperty(localName = "InitgPty")
    private InitiatingParty initgPty;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getCreDtTm() {
        return creDtTm;
    }

    public void setCreDtTm(String creDtTm) {
        this.creDtTm = creDtTm;
    }
    
    public String getNbOfTxs() {
		return nbOfTxs;
	}
    
    public void setNbOfTxs(String nbOfTxs) {
		this.nbOfTxs = nbOfTxs;
	}
    
	public String getCtrlSum() {
		return ctrlSum;
	}
	
	public void setCtrlSum(String ctrlSum) {
		this.ctrlSum = ctrlSum;
	}
	
	public InitiatingParty getInitgPty() {
		return initgPty;
	}
	
	public void setInitgPty(InitiatingParty initgPty) {
		this.initgPty = initgPty;
	}
}
