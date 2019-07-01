package Java_Basics;

import java.util.Scanner;

public class encapsulationBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingAmount obj=new SavingAmount();

Scanner in=new Scanner(System.in);
System.out.println("Enter amount");
obj.setIntialSaving(in.nextInt());
obj.decrementSaving();
obj.incrementSaving();
obj.checkSaving();
System.out.println("Your Current savings are RS "+obj.getCurrentSaving());

	}

}
