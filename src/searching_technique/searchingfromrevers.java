package searching_technique;

import java.util.Scanner;

import javax.swing.JTable.PrintMode;

public class searchingfromrevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key=8;
		//System.out.println("Program running");
		//Scanner input = new Scanner(System.in);
		//int count=input.nextInt();
		//System.out.println("Program running");
		int[] array ={0} ;
		System.out.println(getBinarySearchUnsuccessfulComparisonCount(array,key));
		
	}
	/*
	for(int i=1;i<array.length;i++)
	{
		if(array[i]==key)
		{
			n=(array.length-i);
			
		}
		
		
	}
	System.out.println(n);*/
	
		private static int getBinarySearchUnsuccessfulComparisonCount(int[] array, int key) {
		// TODO Auto-generated method stub
			int start=0,counter=0;
			int end=array.length-1;
			while(start<=end)
			{
				int mid=(start+end)/2;
				if(key==array[mid])
				{
					//System.out.println(mid);
					counter=counter-1;
					
				}
				if(key<array[mid])
				{
					end=mid-1;
					counter=counter+1;
				}
				else
				{
					start=mid+1;
					counter=counter+1;
				}
			}
			//System.out.println("Given key not present in list");
		//System.out.println(counter);
		return counter;
	}
		
	
	

}
