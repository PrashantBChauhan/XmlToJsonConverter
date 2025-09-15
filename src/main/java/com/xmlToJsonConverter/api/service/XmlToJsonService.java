package com.xmlToJsonConverter.api.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xmlToJsonConverter.api.model.request.Pain001Message;


public interface XmlToJsonService {
	
	Pain001Message convert(String xml) throws JsonProcessingException;
}
