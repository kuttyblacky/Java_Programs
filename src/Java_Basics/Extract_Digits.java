package Java_Basics;

import java.util.Scanner;

public class Extract_Digits {
	
public static void main(String args[])
	    {
	        int n, m, a, i = 1, counter = 0;
	        Scanner s=new Scanner(System.in);
	        System.out.print("Enter any number:");
	        n = s.nextInt();
	        m = n;
	       
	        while(m > 0)
	        {
	            a = m % 10;
	            System.out.println(a);
	            m = m / 10;
	            counter--;
	        }
	        while(n > 0)
	        {
	            n = n / 10;
	            counter++;
	        }
	    }
	}

