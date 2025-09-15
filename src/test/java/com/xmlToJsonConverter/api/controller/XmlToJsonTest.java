package com.xmlToJsonConverter.api.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.xmlToJsonConverter.api.model.request.Pain001Message;
import com.xmlToJsonConverter.api.service.XmlToJsonService;

class XmlToJsonTest {
    private MockMvc mockMvc;
    @InjectMocks
    private XmlToJson xmlToJsonController;
    @Mock
    private XmlToJsonService xmlToJsonService;
    @Mock
    Environment env;
    String filePath;
    String xmlInput;
    
    @BeforeEach
    void setup() throws Exception {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(xmlToJsonController).build();        
        filePath = "src/main/resources/PAIN001_Sample/sampleXml.xml"; // Ensure this file exists in your test resources
        when(env.getProperty("data.xml.filePath")).thenReturn(filePath);
        xmlInput = Files.readString(Paths.get(filePath));
    }

    @Test
    void testConvertXmlToJson_Success() throws Exception {
        Pain001Message mockResponse = new Pain001Message();
        when(xmlToJsonService.convert(xmlInput)).thenReturn(mockResponse);
        mockMvc.perform(post("/api/convert")
                .contentType(MediaType.APPLICATION_XML)
                .accept(MediaType.APPLICATION_JSON)
                .content(xmlInput))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
    //C:/Users/pchauha5/OneDrive - Capgemini/Documents/sampleFormat.xml
}
