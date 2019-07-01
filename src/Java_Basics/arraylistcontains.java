package Java_Basics;

import java.util.ArrayList;

public class arraylistcontains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> random=new ArrayList<Float>();
		random.add(2f);
		random.add(4f);
		random.add(5f);
		random.add(10f);
		random.add(99.9f);
		
		random.remove(3);
		random.add(3, 15f);
		printlist(random);
		

	}


public static void printlist(ArrayList<Float> arr)
{
	for(Float num : arr)
	{
		System.out.println(num);
	}
	}
}