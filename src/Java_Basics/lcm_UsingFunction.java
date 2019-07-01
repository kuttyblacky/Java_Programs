package Java_Basics;

import java.util.Scanner;

public class lcm_UsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Enter the two numbers in the input console
        int number1 = scan.nextInt();
		int number2 = scan.nextInt();
        System.out.print(lcm(number1, number2));
	}
	
	public static int lcm(int number1, int number2)
	{
	    int temp,i=2,res;
	    if(number1>number2)
	    res=number1;
	    else
	    res=number2;
	    temp=res;
	    while(res%number1!=0||res%number2!=0)
	    {
	        res=temp*i;
	        i++;
	    }
	    return res;
	}

	

}
