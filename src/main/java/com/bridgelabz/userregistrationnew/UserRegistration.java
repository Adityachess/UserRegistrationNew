package com.bridgelabz.userregistrationnew;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Purpose - As a User need to enter a valid First Name
 * 
 * @author - Aditya Done
 * @version - 17.0
 * @since - 2021-10-22
 */

public class UserRegistration {
	public boolean firstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	/**
	 * Created a method to validate last name
	 */
	public boolean lastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}
}