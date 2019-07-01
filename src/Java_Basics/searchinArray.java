package Java_Basics;

import java.util.Scanner;

public class searchinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner s=new Scanner(System.in);

int arr[]={5,8,2,15,6,25,1,11,13};
int k=11;
search(arr,k);

}
	

	 static void search(int[] arr, int k) {
		// TODO Auto-generated method stub
		 
		for(int i=0;i<=arr.length;i++)
		{
			if(arr[i]==k)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
				
			}
			
		}
	}

}
