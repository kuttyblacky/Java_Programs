package Java_Basics;

public class placeOfArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] votes = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
		    int userWithMostVotes = mostVotes(votes); 
		    
		    System.out.println("User with the most votes is User: " + userWithMostVotes);  
		    }
		    public static int mostVotes(int[] votes)
		    {
		        int maxvalue=votes[0];
		        for(int i=1;i < votes.length;i++)
		        {
		            if(votes[i]>maxvalue)
		            {
		                maxvalue=votes[i];
		                //int position=
		                //int place=Ints.indexof()
		             //   int place=votes.indexof(maxvalue);
		            }
		        } return maxvalue ;
		        

	}

}
