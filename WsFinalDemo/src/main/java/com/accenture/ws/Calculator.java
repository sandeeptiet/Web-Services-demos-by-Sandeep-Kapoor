package com.accenture.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculator {
	@WebMethod 
	public int add(int a, int b) throws NumberFormatException;
	public int subtract(int a, int b);
	public int multiply(int a, int b);
	public String getHelloWorldAsString();
	
}
