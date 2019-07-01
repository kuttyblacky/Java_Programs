package Java_Basics;

import java.util.ArrayList;
import java.util.Random;

public class addingnewelementrandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int random[]={2,4,5,10};
ArrayList ran = new ArrayList();
ran.add(2);
ran.add(4);
ran.add(5);
ran.add(10);
ran.add(99);
printArray(ran);
	}

	public static void printArray(ArrayList random) {
		// TODO Auto-generated method stub
		for(Object a : random)
		{
			System.out.println(a);
		}
	}

}
