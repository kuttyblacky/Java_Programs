package Java_Basics;

interface Shape {
	
	abstract void printing();
}

class Rectangle implements Shape{
	
	@Override
	public void printing()
	{
		System.out.println("The shape is a rectangle");
	}
}
class Triangle implements Shape{
	
	@Override
	public void printing()
	{
		System.out.println("The shape is a triangle");
	}
	
	
}