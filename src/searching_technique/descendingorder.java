package searching_technique;

import java.util.Scanner;

public class descendingorder {
	private static void getdescendingorder(int[] array) {
		// TODO Auto-generated method stub
		int n=array.length;
		for(int i=1;i<n;i++)
		{
			int j=i;
			while (j>0 && array[j-1]<array[j])
			{
				int temp=array[j];
				array[j]=array[j-1];
				array[j-1]=temp;
				j=j-1;
			}
		}
	}
	
	static void print(int[] array)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]+" ");
			//System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//int m=input.nextInt();
		int n=input.nextInt();
		int i=0;
		int[] array=new int[n];
		for(i=0;i<n;i++)
		{
			array[i]=input.nextInt();
		}
		getdescendingorder(array);
		print(array);
	}

	

}
