package Java_Basics;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
	    fizzBuzz(numbers);
	  }
	  
	  public static void fizzBuzz(int[] numbers) {
	      for(int i=0;i<=numbers.length-1;i++)
	      {
	          if(numbers[i]%3==0 && numbers[i]%5==0)
	          {
	              System.out.print("FizzBuzz"+" ");
	          }
	          else if(numbers[i]%3==0)
	          {
	              System.out.print("Fizz"+" ");
	          }
	          else if(numbers[i]%5==0)
	          {
	              System.out.print("Buzz"+" ");
	          }
	          else
	          {
	              System.out.print(numbers[i]+" ");
	          }
	          
	              
	      }

	}

}
