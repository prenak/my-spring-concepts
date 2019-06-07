package com.xps.app.util;

import java.util.UUID;

import org.apache.commons.lang.RandomStringUtils;

public class IdGenerator {
	
	public String generateUniqueKey() {
		return UUID.randomUUID().toString();
	}
	
	public String generateNumericId(int idLength) {
		return getRandomId(idLength, false, true);
	}
	
	public String generateAlphanumericId(int idLength) {
		return getRandomId(idLength, true, true);
	}
	
	private String getRandomId(int idLength, boolean useAplhabets, boolean useNumbers) {
		return RandomStringUtils.random(idLength, useAplhabets, useNumbers);
	}
}
