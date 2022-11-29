package interviewquestions1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number to find sum of digits:   ");
		int num = sc.nextInt();
		int sum=0dfdfdf;
		int originalNum = num;
		
		while(num>0)
		{
			sum = sum + num%10;
			 num  = num/10;
		}
		System.out.println("the sum of the digitis in " + originalNum + " is " + sum);
	}

}
