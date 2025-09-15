package com.xmlToJsonConverter.api.serviceImpl;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.env.Environment;
import com.xmlToJsonConverter.api.model.request.Pain001Message;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.BeforeEach;

class XmlToJsonImplTest {
	
	@InjectMocks
	XmlToJsonImpl xmlToJsonImpl;
	@Mock
	Environment env;
	String filePath;
	String xmlInput;

	@BeforeEach
    void setup() throws Exception {
        MockitoAnnotations.openMocks(this);
        filePath = "C:/Users/pchauha5/OneDrive - Capgemini/Documents/sampleFormat.xml"; // Ensure this file exists in your test resources
        when(env.getProperty("data.xml.filePath")).thenReturn(filePath);
        xmlInput = Files.readString(Paths.get(filePath));
    }
	
    @Test
    void testConvert_ValidXml_ReturnsPain001Message() throws Exception {
        Pain001Message result = xmlToJsonImpl.convert(xmlInput);
        assertNotNull(result);
    }


}

