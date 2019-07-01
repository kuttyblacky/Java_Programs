package Java_Basics;

import javax.xml.transform.Templates;

public class findingnumberinNode {
	static Node head;
	static class Node{
		int data;
		Node next;
	
	 Node(int n){
		 data=n;
		 next=null;
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] temp={5,8,2,15,6,25,1,11,13};
int k=12;
System.out.println(search(k));
	}
	 static boolean search(int k) {
		boolean result=false;
		int temp=5;
		for(int i=0;i<temp;i++)
		{
			System.out.println("Test succcessfull");
		}
		
		// TODO Auto-generated method stub
		return result;
	}

}
