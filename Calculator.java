package com.codebind;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter your choice 1.Addition,2.Subtraction,3.Multiplication,4.Division,5.exit");
		int choice = sc.nextInt();
		int num1 = 0;
		int num2 = 0;
		if(choice!=5)
		{
		System.out.println("Enter two numbers to perform your operation:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		}
		switch(choice) {
		case 1:
			add obj1 = new add();
			System.out.println("After adding"+num1+" "+num2+"the result is"+obj1.addition(num1,num2));
			break;
		
		case 2:
			Subtract obj2 = new Subtract();
			System.out.println("After subtracting"+num1+" "+num2+"the result is"+obj2.sub(num1,num2));
			break;
		
		case 3:
			Multiplication obj3 = new Multiplication();
			System.out.println("After multiplication"+num1+" "+num2+"the result is"+obj3.multiply(num1,num2));
			break;
		
		case 4:
			Division obj4 = new Division();
			System.out.println("After dividing"+num1+" "+num2+"the result is"+obj4.divide(num1,num2));
			break;
			
		case 5:
			System.exit(0);

			
		
		}
		}
		

	}

}