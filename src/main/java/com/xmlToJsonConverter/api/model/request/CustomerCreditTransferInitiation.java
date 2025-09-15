// CustomerCreditTransferInitiation.java
package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.List;

public class CustomerCreditTransferInitiation {
    @JacksonXmlProperty(localName = "GrpHdr")
    private GroupHeader grpHdr;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "PmtInf")
    private List<PaymentInformation> pmtInf;

    public GroupHeader getGrpHdr() {
        return grpHdr;
    }

    public void setGrpHdr(GroupHeader grpHdr) {
        this.grpHdr = grpHdr;
    }

    public List<PaymentInformation> getPmtInf() {
        return pmtInf;
    }

    public void setPmtInf(List<PaymentInformation> pmtInf) {
        this.pmtInf = pmtInf;
    }
}
