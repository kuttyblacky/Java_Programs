package Java_Basics;

public class fiboalgo2 {

	public static void main(String[] args) {
		System.out.println("going to start calculation");
		// TODO Auto-generated method stub
		//fibonacci(1000000000);
		System.out.println(evenSum(5));
		
//System.out.println();
	}
	private static int evenSum(int n)
	{
		return (n/2)*(1+n/2);
	}

	/*private static void fibonacci(int i) {
		int a=0,b=1,c=i;
		for(int j=2;j<=i;j++)
		{
			c=(a+b)%10;
			a=b;
			b=c;
		}
	System.out.println(c);
		
		// TODO Auto-generated method stub
		
	}*/
	/*
	public static int evenSum(int n)
	{
		if(n<=1)
		{
			return 0;
		}
		else if(n%2==0)
		{
			return (n+evenSum(n-1));
		}
		else
		{
			return evenSum(n-1);
		}
		
	}*/

}
