package Java_Basics;

public class asciiValueprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=97;
		int counter=0;
		while(counter<26)
		{
			System.out.print(c+" ");
			c=(char) (c+1);
			counter=counter+1;
		}
		

	}

}
