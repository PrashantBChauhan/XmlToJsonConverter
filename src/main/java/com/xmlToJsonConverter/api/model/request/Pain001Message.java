// Pain001Message.java
package com.xmlToJsonConverter.api.model.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Document")
public class Pain001Message {
    @JacksonXmlProperty(localName = "CstmrCdtTrfInitn")
    private CustomerCreditTransferInitiation cstmrCdtTrfInitn;

    public CustomerCreditTransferInitiation getCstmrCdtTrfInitn() {
        return cstmrCdtTrfInitn;
    }

    public void setCstmrCdtTrfInitn(CustomerCreditTransferInitiation cstmrCdtTrfInitn) {
        this.cstmrCdtTrfInitn = cstmrCdtTrfInitn;
    }
}
