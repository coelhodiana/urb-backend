package com.coelhodiana.blogPessoal.model;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class instaUrl {

	private Value content;

	public Value getContent() {
		return content;
	}

	public void setContent(Value content) {
		this.content = content;
	}
	
}
