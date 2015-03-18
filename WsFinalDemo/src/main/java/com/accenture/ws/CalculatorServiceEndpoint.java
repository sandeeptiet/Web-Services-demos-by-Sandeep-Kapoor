package com.accenture.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

//@Component
//@WebService(serviceName="CalculatorService")
public class CalculatorServiceEndpoint{

	CalculatorImpl calculatorImpl;
	
	public CalculatorImpl getCalculatorImpl() {
		return calculatorImpl;
	}

	public void setCalculatorImpl(CalculatorImpl calculatorImpl) {
		this.calculatorImpl = calculatorImpl;
	}

	@WebMethod
	public int add(int a, int b) {
		return calculatorImpl.add(a, b);
	}
	
	@WebMethod
	public int subtract(int a, int b) {
		return calculatorImpl.subtract(a, b);
	}
}
