package Java_Basics;

public class Placeofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int thousand=34768;
int thouss=thousand / 10000;

//int thousand1=thousand %10000;

int ten=(thousand %10000)/ 1000;

int ten1=((thousand %10000)%1000 )/ 100;

int ten2=(((thousand %10000)%1000 )% 100)/10;
int ten3=(((thousand %10000)%1000 )% 100)%10;
//System.out.println((thousand %10000)/1000);
	System.out.println(thouss);
	System.out.println(ten);
	System.out.println(ten1);
	System.out.println(ten2);
	System.out.println(ten3);
	}

}
