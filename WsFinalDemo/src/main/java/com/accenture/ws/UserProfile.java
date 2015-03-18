package com.accenture.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface UserProfile {
	@WebMethod
	String getUserName();
}
