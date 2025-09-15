package com.xmlToJsonConverter.api.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xmlToJsonConverter.api.model.request.Pain001Message;
import com.xmlToJsonConverter.api.service.XmlToJsonService;

@RestController
@RequestMapping("/api/convert")
public class XmlToJson {
	Environment env;
	private XmlToJsonService xmlToJsonService;
	
	public XmlToJson(XmlToJsonService xmlToJsonService, Environment env) {
		this.xmlToJsonService = xmlToJsonService;
		this.env = env;
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Pain001Message convertXmlToJson() throws IOException {
        String filePath = env.getProperty("data.xml.filePath");
        String xml = Files.readString(Paths.get(filePath));
        return xmlToJsonService.convert(xml);
    }
}
