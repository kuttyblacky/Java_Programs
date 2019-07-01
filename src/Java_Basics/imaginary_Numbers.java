package Java_Basics;

import java.util.Scanner;

public class imaginary_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		PurelyImaginary num=new PurelyImaginary(in.nextDouble(),in.nextDouble());
		System.out.println(num.getImaginaryPart());
		num.checkComplex();
		num.checkPurelyImaginaryNumber();

	}

}
