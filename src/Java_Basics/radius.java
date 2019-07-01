package Java_Basics;

public class radius {
    public static float radius = 10.0f;

    public static void main(String[] args){

    System.out.println(3.141*radius*radius); //This line is finding area of circle directly

    System.out.println(area(radius)); // This line is finding area of circle using an method called area which is available in line 13
    System.out.println(circle.area(radius)); // This line is finding area of circle using an another class called circle which is available in line 20
}
    public static float area(float radius)
    {;
        return 3.141f*radius*radius; //Returning value of circle by getting value from main method "radius" is a input from main method
    }
}
class circle
{
    public static float area(float radius)
    {
        System.out.println("from cricle class");//Returning value of circle by getting value from main class "radius" is a input from main method is add
        return 3.141f*radius*radius;
    }
}
