package com.xmlToJsonConverter.api.serviceImpl;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.xmlToJsonConverter.api.model.request.Pain001Message;
import com.xmlToJsonConverter.api.service.XmlToJsonService;

@Service
public class XmlToJsonImpl implements XmlToJsonService {

	@Override
	public Pain001Message convert(String xml) throws JsonProcessingException {
		XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(xml, Pain001Message.class);
	}

}
