package searching_technique;

public class searchingelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,6,7,8,9};
		int m=11;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=m)
			{
				System.out.println("Element not found");
			}
			else
			{
				System.out.println(m+" "+"Array contains searching element at"+i+"place, value of array is"+arr[i]);
			}
		}

	}

}
