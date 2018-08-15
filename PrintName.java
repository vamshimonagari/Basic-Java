package com.vamshi.javabasic;

import java.util.Scanner;

public class PrintName {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.println("Enter your First Name: ");
		String fname = input.next();
		System.out.println("Enter your Last Name: ");
		String lname = input.next();
		System.out.println("Hello\n" +fname +" " +lname);	
		
		
	}

}
