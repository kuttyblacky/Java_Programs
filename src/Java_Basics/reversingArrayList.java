package Java_Basics;

import java.util.ArrayList;

public class reversingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int list[]={9,3,14,22,1,-6,18,15};
/*ArrayList<Integer> list=new ArrayList<Integer>();
list.add(9);
list.add(3);
list.add(14);
list.add(22);
list.add(1);
list.add(-6);
list.add(18);
list.add(15);*/

reverseArrayList(list);

}
	

	 static void reverseArrayList(int[] list) {
		 int n=list.length;
		 int[] list1=new int[n];
		 int j=n;
		 for(int i=0;i<n;i++)
		 {
			 list1[j-1]=list[i];
			 j=j-1;
		 }
		
	
	 for(int i=0;i<list1.length;i++)
		{
		System.out.println(list1[i]+" ");	
		}
	 }
}
