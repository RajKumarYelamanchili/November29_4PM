package interviewquestions1234;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number to count digit:   ");
		int num = sc.nextInt();
		int originalNum= num;
		int count=0;
		
		while(num >0)
		{
			num  = num/10;
			count++;
		}

		
		System.out.println("Total number of digits in " + originalNum + " is " + count);
	}

}
