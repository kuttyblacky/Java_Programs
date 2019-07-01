package Java_Basics;

public class moveZeros_last {
	
	static void moveZeroToEnd(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		 int count=0;
		 for(int i=0;i<n;i++)
			 if(arr[i]!=0)
				 arr[count++]=arr[i];
			 
		 while(count<n)
			arr[count++]=0;
			 

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,8,0,15,6,0,1,0,13};
		int n=arr.length;
		moveZeroToEnd(arr);
		for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
	}

	 

}
