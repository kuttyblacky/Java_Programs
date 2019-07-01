package Java_Basics;

import java.util.Scanner;

public class averageofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,sum=0,avg = 0,num;
Scanner input=new Scanner(System.in);
//System.out.println("Enter how many number to be calculated for average");
n=input.nextInt();
for(int i=1;i<=n;i++)
{
//System.out.println("Enter"+i+"value");
num=input.nextInt();
sum=sum+num;
avg=sum / n;
}

	System.out.println(avg);	
	}

}
