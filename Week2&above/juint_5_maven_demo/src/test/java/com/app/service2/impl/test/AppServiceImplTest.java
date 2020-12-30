package com.app.service2.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.app.exception.BusinessException;
import com.app.service2.AppService;
import com.app.service2.impl.AppServiceImpl;

class AppServiceImplTest {
	
	private static AppService app;
	
	@BeforeAll
	public static void setUp() {
		app = new AppServiceImpl();
	}

	@Test
	void testIsValidPrimeNumberforTrue() {
		assertTrue(app.isValidPrimeNumber(3));
	}
	
	@Test
	void testIsValidPrimeNumberforFalse() {
		assertFalse(app.isValidPrimeNumber(4));
	}
	
	@Test
	void testIsValidPrimeNumberforNegativeNumber() {
		assertFalse(app.isValidPrimeNumber(-4));
	}

	@Test
	void testIsValidMobileNumberforTrue() {
		assertTrue(app.isValidMobileNumber("+1-1234567890"));
	}
	
	@Test
	void testIsValidMobileNumberforException() {
		Executable executable=new Executable() {
			
			@Override
			public void execute() throws Throwable {
				app.isValidMobileNumber(null);
				
			}
		};
		assertThrows(BusinessException.class, executable);
	}

}
