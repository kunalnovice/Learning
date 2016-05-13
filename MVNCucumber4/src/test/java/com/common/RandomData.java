package com.common;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomData {
	String email;
	String password;

	
	public String getEmail() {
		String first = "Name"
				+ RandomStringUtils.randomAlphabetic(5).toLowerCase();
		String domain = "Domain"
				+ RandomStringUtils.randomAlphabetic(3).toLowerCase();
		String topveleveldomain = "com";
		email = first + "@" + domain + "." + topveleveldomain;
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		password = "Pass" + (RandomStringUtils.randomAlphabetic(8).toLowerCase());
		return password;

	}

	public void setDoc_name(String doc_name) {
		this.password = doc_name;
	}
	
}