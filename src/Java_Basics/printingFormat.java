package Java_Basics;

import java.util.Scanner;

public class printingFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int len=s1.length();
            int space=15-len;
            int x=sc.nextInt();
            //Complete this line
            if(x>99){
                System.out.print(s1);
                for(int j = 0; j < space;j++)
                { 
                    System.out.print(" "); 
                    }
                 System.out.println(x);
         }else if(x<10)
         { System.out.print(s1);
             for(int j = 0; j < space;j++)
                {
                    System.out.print(" "); 
                    }
         System.out.println("00"+x);
     }
        

         else
         { System.out.print(s1);
             for(int j = 0; j < space;j++)
                {
                    System.out.print(" "); 
                    }
         System.out.println("0"+x);
     }
         }
        
        System.out.println("================================");

}


}
