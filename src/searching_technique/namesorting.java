package searching_technique;

import java.util.Scanner;

public class namesorting {
	private static void ascendingorder(String[] array) {
		// TODO Auto-generated method stub
		int n=array.length;
		String temp="";
		for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
		if(array[i].compareToIgnoreCase(array[j])>0){
		temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		}
		}
	}
	}
	private static void descendingorder(String[] array) {
		// TODO Auto-generated method stub
		int n=array.length;
		String temp="";
		for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
		if(array[i].compareToIgnoreCase(array[j])<0){
		temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		}
		}
	}
	}
	
	static void printingarray(String[] array)
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
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		String firstNames[]= new String[size];
		String lastNames[]= new String[size];
		for(int i=0;i<size;i++)
		{
			firstNames[i]=scanner.next().toLowerCase();	
		}
		for(int i=0;i<size;i++)
		{
			lastNames[i]=scanner.next().toLowerCase();	
		}
		ascendingorder(firstNames);
		printingarray(firstNames);
		descendingorder(lastNames);
		printingarray(lastNames);

	}

	
}
