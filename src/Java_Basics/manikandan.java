package Java_Basics;

import java.util.Arrays;

public class manikandan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//System.out.println("checking grded question");
//System.out.println(func(88));
		//factorial2(4);
		

	}

	/*private static int factorial2(int x,int b) {
		// TODO Auto-generated method stub
		if(b==0)
		{
			return 0;
		}
		else if(b%2==0)
		{
			return factorial2(x+x, b/2);
			
		}
		else
		{
			return factorial2(x + x, b/2)+x;
		}
	}*/

	
	/*private static int func(int n) {
		// TODO Auto-generated method stub
		if(n>100)
			return n-10;
		else
			return func(func(n+11));
	}*/
	/*public static void factorial1(int n){
		   int factorial=1;
		   int index=1;
		   for(int i=0;i<=Math.pow(n,n);i++){
		       if(i==factorial*index){
		           factorial=i;
		           index+=1;
		           if(index==n+1){
		               System.out.println(factorial);
		               break;
		           }
		       }
		   }
		}*/
	/*public static void factorial2(int n){
	    int[] factorials = new int[n+1];
	    Arrays.fill(factorials, 1);
	    for(int i = 0; i <= n-1; i++){
	       factorials[i+1] = (i+1)*factorials[i];
	     }
	     System.out.println(factorials[n]);
	}*/
}
