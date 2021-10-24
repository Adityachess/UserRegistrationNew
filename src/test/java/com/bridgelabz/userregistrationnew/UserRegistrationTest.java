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
}
