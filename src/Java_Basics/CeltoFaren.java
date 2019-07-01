package Java_Basics;

import java.util.Scanner;

public class CeltoFaren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value for celcius");
		int cel=input.nextInt();
		int faren=(cel*9)/5+32;
		System.out.println(faren);
	}

}

