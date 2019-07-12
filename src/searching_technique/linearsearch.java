package searching_technique;

import java.util.Scanner;

public class linearsearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
	       int i;
	       
	       Scanner input = new Scanner(System.in);
	       count = input.nextInt();
	       int inputArr[] = new int[count+1];
	       
	       for (i = 1; i <= count; i++) {
	    	   inputArr[i] = input.nextInt();
	       }
	      
	       int key = input.nextInt();
	       input.close();
	       System.out.println(getLinearSearchUnsuccessfulComparisonCount(inputArr,key));
	}

	public static int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
		//return key;
		   // Write your code here]
		int counter=0;
		int size = inputArr.length;
        for (int i = 1; i < size; i++) {
            if (inputArr[i] == key) {
                counter=counter-1;
            }
            counter=counter+1;
        }
        //This is the default value if the key is not found in the array.
        return counter;
		   }
}
