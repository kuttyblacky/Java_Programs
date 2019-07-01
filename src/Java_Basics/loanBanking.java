package Java_Basics;

import java.util.Scanner;

public class loanBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
double amount=in.nextDouble();
int time=in.nextInt();
Homeloan obj1=new Bank1(amount,time);
Homeloan obj2=new Bank2(amount,time);
if(obj1.simpleInterest()<obj2.simpleInterest())
{
System.out.println("File for a loan in Bank1");
System.out.println(obj1.simpleInterest());
}
else
{
	System.out.println("File for a loan in Bank2");
	System.out.println(obj2.simpleInterest());
	}
	
	}

}
