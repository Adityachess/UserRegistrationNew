package com.bridgelabz.userregistrationnew;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration;

	@Before
	public void before() {
		userRegistration = new UserRegistration();
	}

	@Test
	public void givenFirstNameWhenProperShouldReturnTrue() {
		boolean result = userRegistration.firstName("Aditya");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstNameWhenNotProperShouldReturnFalse() {
		boolean result = userRegistration.firstName("aditya");
		Assert.assertFalse(result);
	}

	/**
	 * Unit test for validating last name
	 */
	@Test
	public void givenLastNameWhenProperShouldReturnTrue() {
		boolean result = userRegistration.lastName("Done");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastNameWhenNotProperShouldReturnFalse() {
		boolean result = userRegistration.lastName("done");
		Assert.assertFalse(result);
	}

	/**
	 * Unit test for validating email address
	 */
	@Test
	public void givenEmailWhenProperShouldReturnTrue() {
		boolean result = userRegistration.email("abc@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailWhenNotProperShouldReturnFalse() {
		boolean result = userRegistration.email("abc()*@gmail.com");
		Assert.assertFalse(result);
	}

	/**
	 * Unit test for validating format of mobile number
	 */
	@Test
	public void givenPhoneNumberWhenProperShouldReturnTrue() {
		boolean result = userRegistration.phoneNumber("91 8554830391");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhoneNumberWhenNotProperShouldReturnFalse() {
		boolean result = userRegistration.phoneNumber("+91 8554830391");
		Assert.assertFalse(result);
	}

	/**
	 * Unit test for validating password with minimum 8 character
	 */
	@Test
	public void givenPasswordWhenProperShouldReturnTrue() {
		boolean result = userRegistration.password("password@123");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPasswordWhenNotProperShouldReturnFalse() {
		boolean result = userRegistration.password("psw@");
		Assert.assertFalse(result);
	}

	/**
	 * Unit test for validating password with atLeast one upper case
	 */
	@Test
	public void givenPasswordRule2WhenProperShouldReturnTrue() {
		boolean result = userRegistration.passwordRule2("passWord@123");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPasswordRule2WhenNotProperShouldReturnFalse() {
		boolean result = userRegistration.passwordRule2("psw@");
		Assert.assertFalse(result);
	}
}
