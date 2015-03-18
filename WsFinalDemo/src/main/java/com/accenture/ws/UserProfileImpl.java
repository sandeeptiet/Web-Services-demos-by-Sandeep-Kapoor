package com.accenture.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="com.accenture.ws.UserProfile", serviceName="UserProfileService")
public class UserProfileImpl implements UserProfile {

	@Override
	@WebMethod
	public String getUserName() {
		return "getUserName() : returned value";
	}

}
