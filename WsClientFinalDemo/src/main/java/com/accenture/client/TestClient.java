package com.accenture.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.ws.Calculator;

public class TestClient {
	
	private static final String WS_URL = "http://localhost:8981/tss/CalculatorService?wsdl";
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("servlet-context.xml");
		Calculator client = (Calculator) context.getBean("calculatorService");
		System.out.println(client.add(3, 7));
		System.out.println(client.multiply(3, 7));
		//wsimport -keep -s src -d gen http://localhost:8981/tss/CalculatorService?wsdl
		//http://localhost:8981/tss/CalculatorService?wsdl
		
		/*******************UserName & Password ******************************/
        Map<String, Object> req_ctx = ((BindingProvider)client).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);
 
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("Username", Collections.singletonList("mkyong"));
        headers.put("Password", Collections.singletonList("password"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
 
        System.out.println(client.getHelloWorldAsString());
        
	}

}
