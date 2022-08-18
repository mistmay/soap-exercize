package com.advancia.idCardSoap.app;

import com.advancia.idCardSoap.service.IdCardServiceImpl;

import jakarta.xml.ws.Endpoint;

public class AppServer {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9980/idcard", new IdCardServiceImpl());
		System.out.println("Service Started!");
	}
}
