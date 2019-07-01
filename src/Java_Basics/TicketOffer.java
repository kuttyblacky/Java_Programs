package Java_Basics;

import java.util.Scanner;
import java.util.stream.IntStream;

public class TicketOffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myAge;
		int ageOfBrother;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your age");
		myAge=input.nextInt();
		System.out.println("Enter your brother age");
		ageOfBrother=input.nextInt();
		if((myAge>0)&&(ageOfBrother>0))
		{
			boolean result=(myAge<25)&&(ageOfBrother<25);	
		System.out.println(result);
		//return result;
		}
		else
		{
			System.out.println(false);
			
		}
		

	}

}
