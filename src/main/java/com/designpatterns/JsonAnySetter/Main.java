package com.designpatterns.JsonAnySetter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("D:\\dev\\java\\design-patterns\\src\\main\\resources\\some.json");

		Glossary glossary = mapper.readValue(file, Glossary.class);

		System.out.println(glossary);
	}
}
