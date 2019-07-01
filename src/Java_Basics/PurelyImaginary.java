package Java_Basics;

class Number{
	public double real;
	public double img;
	

	public Number(double real,double img) {
		// TODO Auto-generated method stub
		this.real=real;
		this.img=img;
		
	}
	
public double getImaginaryPart() {
	// TODO Auto-generated method stub
	return this.img;
}

public double getreal() {
	// TODO Auto-generated method stub
	return this.real;
}
public void setReal(double real)
{
this.real=real;	
}
public void setimg(double img)
{
this.real=img;	
}
}


class Complex extends Number{
	
	double real;
	double img;
	public Complex(double real, double img)
	{
		super(real,img);
		this.real=real;
		this.img=img;
	}

	public void checkComplex() {
		// TODO Auto-generated method stub
		if(real!=0&&img!=0)
		{
			System.out.println("The given number is complex"+"\n"+real+"+"+"i"+img);

		}
		else if(real==0&&img!=0)
		{
			System.out.println("The given number is complex"+"\n"+"i"+img);
		}
		else
		{
			System.out.println("The given number is real");
			System.out.println(real+"+"+"i"+img);
			
			
		}
	}

	
	
}


public class PurelyImaginary extends Complex {
	double real;
	double img;

	public PurelyImaginary(double real, double img) {
		
		super(real,img);
		this.real=real;
		this.img=img;
	}

	public void checkPurelyImaginaryNumber() {
		if(real==0&&img!=0)
		{
			System.out.println("The number is purely imaginary");
		}
		else
		{
			System.out.println("The number is not purely imaginary");
		}
		
	}

}
