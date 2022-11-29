package interviewquestions;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number to find factorial:  ");
		int num = sc.nextInt();//5
		
		int factorial =1;
		
		for(int i=1;i<=num;i++)
		{
			factorial= factorial*i;
		}
		System.out.println("Factorial of "+ num + " is "+   factorial);
	}

}
