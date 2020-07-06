package com.in28min.login;

public class LoginService {

	public boolean validateCredentials(String name,String password) {
		
		if(name.equals("satya")&& password.equals("qazxsw123")) {
			return true;
			
		}else {
			return false;		
		}
	
	}
}
