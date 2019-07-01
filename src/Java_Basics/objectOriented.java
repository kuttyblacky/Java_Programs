package Java_Basics;

public class objectOriented {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(1056,"Mani", 6.75);
s1.displayProfile();
System.out.println("Percentage of s1"+s1.findPercentage());
	}

}
class Student{
	public int rollno;
	public String name;
	public double cgpa;
	
	public Student(int rollno, String name,double cgpa)
	{
		this.rollno=rollno;
		this.name=name;
		this.cgpa=cgpa;
		
	}
	
	public void displayProfile(){
		System.out.println(rollno+" "+name+" "+cgpa);
	}
	
	public double findPercentage()
	{
		double percent=cgpa*10;
		return percent;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
