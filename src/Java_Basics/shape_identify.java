package Java_Basics;

import java.util.Scanner;

public class shape_identify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);
        Shape obj = new Triangle();
        Shape obj1 = new Rectangle();
        int numberOfSides = in.nextInt();
        if(numberOfSides==0)
        {
        	System.out.println("The shape is a circle");
        }else if(numberOfSides==3)
        {
        	obj.printing();
        	
        }else if(numberOfSides==4)
        {
        	obj1.printing();
        }else{
            System.out.println("Enter a valid number of sides!");
        }
        
	}

}
