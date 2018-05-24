package com.gc.lab21.Lab21;

import org.springframework.stereotype.Component;

@Component
public class userInfo {

	private String firstName;


	public userInfo() {
		firstName = "";
		}

	public userInfo(String firstName) {
		super();
		this.firstName = firstName;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	

	@Override
	public String toString() {
		return "userInfo [firstName=" + firstName + "]";
	}

}
