// PaymentInformation.java
package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonPropertyOrder({ "pmtInfId", "pmtMtd", "nbOfTxs", "ctrlSum", "pmtTpInf", "reqdExctnDt", "dbtr", "dbtrAcct", "dbtrAgt", "cdtTrfTxInf" })
	public class PaymentInformation {
    @JacksonXmlProperty(localName = "PmtInfId")
    private String pmtInfId;

    @JacksonXmlProperty(localName = "PmtMtd")
    private String pmtMtd;
    
    @JacksonXmlProperty(localName = "NbOfTxs")
    private String nbOfTxs;
    
    @JacksonXmlProperty(localName = "CtrlSum")
    private String ctrlSum;
    
    @JacksonXmlProperty(localName = "PmtTpInf")
    private PaymentTypepInformation pmtTpInf;
    
    @JacksonXmlProperty(localName = "ReqdExctnDt")
    private String reqdExctnDt;
    
    @JacksonXmlProperty(localName = "Dbtr")
    private DebtorName dbtr;
    
    @JacksonXmlProperty(localName = "DbtrAcct")
    private DebtorAccountDetails dbtrAcct;
    
    @JacksonXmlProperty(localName = "DbtrAgt")
    private DebtorAgent dbtrAgt;
    
    @JacksonXmlProperty(localName = "CdtTrfTxInf")
    private CreditTransferTransactionInformation cdtTrfTxInf;
    
    
    public String getPmtInfId() {
        return pmtInfId;
    }

    public void setPmtInfId(String pmtInfId) {
        this.pmtInfId = pmtInfId;
    }

    public String getPmtMtd() {
        return pmtMtd;
    }

    public void setPmtMtd(String pmtMtd) {
        this.pmtMtd = pmtMtd;
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
    
	public PaymentTypepInformation getPmtTpInf() {
		return pmtTpInf;
	}
	
	public void setPmtTpInf(PaymentTypepInformation pmtTpInf) {
		this.pmtTpInf = pmtTpInf;
	}
	
	public String getReqdExctnDt() {
		return reqdExctnDt;
	}
	
	public void setReqdExctnDt(String reqdExctnDt) {
		this.reqdExctnDt = reqdExctnDt;
	}
	
	public DebtorName getDbtr() {
		return dbtr;
	}
	
	public void setDbtr(DebtorName dbtr) {
		this.dbtr = dbtr;
	}
	
	public DebtorAccountDetails getDbtrAcct() {
		return dbtrAcct;
	}
	
	public void setDbtrAcct(DebtorAccountDetails dbtrAcct) {
		this.dbtrAcct = dbtrAcct;
	}
	
	public DebtorAgent getDbtrAgt() {
		return dbtrAgt;
	}
	
	public void setDbtrAgt(DebtorAgent dbtrAgt) {
		this.dbtrAgt = dbtrAgt;
	}
	
	public CreditTransferTransactionInformation getCdtTrfTxInf() {
		return cdtTrfTxInf;
	}
	
	public void setCdtTrfTxInf(CreditTransferTransactionInformation cdtTrfTxInf) {
		this.cdtTrfTxInf = cdtTrfTxInf;
	}
}
