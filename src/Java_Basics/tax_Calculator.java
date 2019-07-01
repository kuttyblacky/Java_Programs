package Java_Basics;

public class tax_Calculator {
	public static void main(String[] args) {

		double income=600000;
		int age=75;
		double tax=0.0;
		if(income>250000)
		{
			
			if(income>250001 && age<60){
			double salary=250000;
			
				income=income-salary;
				
				tax=.1*salary;
				
				if(income>250000)
				{
					
			double	tax2=(income-salary)*.2;
			double	taxfinal=tax+tax2;
				System.out.println(taxfinal);
				}
				
				
			}
			if((income>250001) && age>60 ||age < 80){
				double salary=250000;
				
					income=income-salary;
					
					tax=.1*salary;
					
					if(income>250000)
					{
						
				double	tax2=(income-salary)*.2;
				double	taxfinal=tax+tax2;
					System.out.println(taxfinal);
					}
					
					
				}
			
		}
	}
	}
