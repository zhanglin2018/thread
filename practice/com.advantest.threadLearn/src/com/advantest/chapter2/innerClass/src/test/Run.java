package com.advantest.chapter2.innerClass.src.test;

import com.advantest.chapter2.innerClass.src.test.PublicClass.PrivateClass;

public class Run {

	public static void main(String[] args) {

		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");

		System.out.println(publicClass.getUsername() + " "
				+ publicClass.getPassword());

		PrivateClass privateClass = publicClass.new PrivateClass();
		PrivateClass privateClass2 = publicClass.new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");

		System.out.println(privateClass.getAge() + " "
				+ privateClass.getAddress());

	}

}
