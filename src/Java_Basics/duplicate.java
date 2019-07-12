package Java_Basics;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] duplicatee={1,2,3,4,5,6,7,8,9,10,11,12,12,13};
		dupli(duplicatee);

	}

	public static void dupli(int[] duplicatee) {
		// TODO Auto-generated method stub
		System.out.println("Duplicate of value is going to be identified");
        for(int i=0;i<duplicatee.length;i++)
        {
        	for(int j=i+1;j<duplicatee.length;j++)
        	{
        		if(duplicatee[i]==duplicatee[j])
        		{
        			System.out.println("Found duplicate value");
        			System.out.println("Duplicate fist value is"+duplicatee[i]+"second value is"+duplicatee[j]);
        			
        		}
        		
        		
        		
        		
        	}
        }
    	//System.out.println("Duplicate not found");
	}

}
