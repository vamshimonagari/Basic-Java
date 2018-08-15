package com.vamshi.javabasic;

import java.util.Scanner;

public class PrintNum {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.println("Give the first num");
		int n1 = input.nextInt();
		System.out.println("Give the second num");
		int n2 = input.nextInt();
		int add = n1+n2, sub = n1-n2, div = (n1/n2);
		System.out.printf("Sum = %d\nMinus = %d\nDivide = %d\n", add, sub, div);
		
		

	}

}
