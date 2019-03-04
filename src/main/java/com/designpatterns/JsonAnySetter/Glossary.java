package com.designpatterns.JsonAnySetter;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Glossary {
	String title;
	Map<String, Object> otherValues = new HashMap<>();

	@JsonAnySetter
	public void setAny(String key, Object value) {
		otherValues.put(key, value);
	}
}