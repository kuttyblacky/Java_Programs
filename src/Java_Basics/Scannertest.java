package Java_Basics;
import java.util.Scanner;

public class Scannertest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner input=new Scanner(System.in);
System.out.println("Enter value for num1");
a = input.nextInt();
System.out.println("Enter value for num2");
b = input.nextInt();
System.out.println("Enter value for num3");
c = input.nextInt();

System.out.println(a*b+c);
	}

}

