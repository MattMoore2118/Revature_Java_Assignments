package com.app.service.test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.service.MyServices;

class MyServicesTest {

	private static MyServices services;
	
	@BeforeAll
	public static void setupMyServices() {
		services=new MyServices();
	}
	
	@Test
	public void testSayHiByName() {
		String output ="Hi Matt";
		assertEquals(output, services.sayHi("Matt"));
	}
	
	@Test
	public void testSayHiForNull() {
		assertNull(services.sayHi(null));
	}
}
