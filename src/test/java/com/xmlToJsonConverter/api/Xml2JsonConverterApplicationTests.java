package com.xmlToJsonConverter.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Xml2JsonConverterApplicationTests {

	@Test
	void contextLoads() {
		String[] args = {"Hi"};
		Xml2JsonConverterApplication.main(args);
	}
}
