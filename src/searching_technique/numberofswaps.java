package searching_technique;
import java.util.*;

public class numberofswaps {
public static void  main(String[] args)
{
	Scanner input=new Scanner(System.in);
	int m=input.nextInt();
	int n=input.nextInt();
	int i=0;
	int[] array=new int[n];
	for(i=0;i<n;i++)
	{
		array[i]=input.nextInt();
	}
	totalBubbleSortSwaps(array,m);
}

private static void totalBubbleSortSwaps(int[] array, int m) {
	// TODO Auto-generated method stub
	int size=array.length;
	int totalswaps=0;
	if(m==0)
	{
		System.out.println("There is no iteration for given Size");
	}
	else
	{
		for(int i=0;i<size;i++)
		{
			for(int j=1;j<size-1;j++)
			{
			if(array[j-1]<array[j])
			{
				int temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
				totalswaps=totalswaps+1;
			}
			//totalswaps=totalswaps+1;
			}
			totalswaps=totalswaps+1;
		}
	}
System.out.println(totalswaps-m);
}
}
