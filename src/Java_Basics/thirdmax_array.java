package Java_Basics;

public class thirdmax_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={5,8,2,15,6,25,1,11,13};
thirdMaxInteger(arr);
	}

	 static void thirdMaxInteger(int[] arr) {
		// TODO Auto-generated method stub
		 int n=arr.length;
		 if(n<3)
		 {
			 System.out.println("The array doesn't have a third maximum element");
		 }
		 else
		 {
			 int temp;
			 
			   
			for (int i = 1; i < arr.length; i++) {
			    for (int j = i; j > 0; j--) {
			     if (arr[j] < arr [j - 1]) {
			      temp = arr[j];
			      arr[j] = arr[j - 1];
			     arr[j - 1] = temp;
			     }
			    }
			   }
			if(arr[1]==arr[2]&&arr[1]==arr[3]&&arr[2]==arr[3])
			{
				System.out.println("The array doesn't have a third maximum element1");
			}
			else
			{
				System.out.println(arr[arr.length-3]);
			}
			
			  /* if(arr.equals(arr))
			   {
				   for (int i = 0; i < arr.length; i++) {
					    for (int k = 0; k < arr.length; k++) {
					        if (arr[i] == arr[k] || arr[i+1] ==arr[k+2] ||arr[i+2] ==arr[k+3]) {
					            System.out.println("The array doesn't have a third maximum element1");
					        }
					        else
							   {
								   System.out.println(arr[arr.length-3]);
								   
							   }
					 
					    }
					}
				   
			   }*/
			   
		 }
		
	}

}
