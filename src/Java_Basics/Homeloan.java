package Java_Basics;

public class Homeloan {
double amount;
int time;
public Homeloan(double amount, int time)
{
	this.amount=amount;
	this.time=time;
}

double getAmount()
{
	return amount;
}
int getTime()
{
	return time;
}

public double simpleInterest() {
	return 0;
}

}
class Bank1 extends Homeloan{
	
	
	public Bank1(double amount, int time) {
		super(amount, time);
		// TODO Auto-generated constructor stub
	}
	double getRateOfInterest()
	{
	return 7.2;
	}
	public double simpleInterest()
	{
		double interest=(amount*time*getRateOfInterest())/100;
		return interest+amount;
		
	}
	
	}
class Bank2 extends Homeloan{
	
	public Bank2(double amount, int time) {
		super(amount, time);
	}

	double getRateOfInterest(){
		return 8.1;
	}
	public double simpleInterest()
	{
		double interest=(amount*time*getRateOfInterest())/100;
		return interest+amount;
		
	}
}