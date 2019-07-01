package Java_Basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringBufferInputStream;
import java.util.Scanner;

public class readingFile {

	public static void main(String[] args) throws  FileNotFoundException{
		// TODO Auto-generated method stub
		File inputfile= new File("D://Manikandan.R//Java_Block_chain_Practice//aliceinwonderland.txt");
		Scanner scan=new Scanner(inputfile);
		int sum=0;
		int linenumber=1;
		while(scan.hasNextLine()==true)
		{
			int number=scan.nextInt(); 
			sum=sum+number;
			linenumber++;
			
		}
int mean=sum/linenumber;
		System.out.println("Sum is:"+mean);

		}
	}


