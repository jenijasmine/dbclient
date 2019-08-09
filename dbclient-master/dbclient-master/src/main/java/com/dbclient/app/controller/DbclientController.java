package com.dbclient.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbclientController {

	@PostMapping(value="/check")
	public String persi(@RequestBody final String elementValue)
	{
	System.out.println(elementValue);
	return elementValue;
	}
}
