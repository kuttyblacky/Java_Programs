package Java_Basics;

import java.util.Scanner;




class Cards {
int value;
String suit;
boolean color;

public void setCards(int r, String suit, boolean color) {
    this.value = r;
    this.suit = suit;
    this.color = color;
}


int getSuitPriority(String suitString) {

	int a=4,b=3,c=2,d=1;
	int result=0;
	if(suitString.equalsIgnoreCase("spades"))
	{
		result=a;
	}
	else if(suitString.equalsIgnoreCase("Diamond"))
	{
		result=b;
	}
	else if(suitString.equalsIgnoreCase("Hearts"))
	{
		result=c;
	}
	else 
	{
		result=d;
	}
	return result;

}
}
class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {
if(c1.value>c2.value)
{
points1=points1+1;
}
else if(c1.value==c2.value)
{
if(c1.getSuitPriority(c1.suit)>c2.getSuitPriority(c2.suit))
{

	System.out.println("failed");	
	points1=points1+1;
}
else if(c1.getSuitPriority(c1.suit)<c2.getSuitPriority(c2.suit))
{

	System.out.println("Passed");	
	points2=points2+1;
}

}
else
{
	points2=points2+1;
	}

        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }


}


public class Source_cardsgame {

	public static void main(String[] args) {

        Cards c1 = new Cards();
        Cards c2 = new Cards();

        String s1 = "clubs";
        c1.setCards(2 ,s1, true);
        String s2 = "spades";
        c2.setCards(2,s2, true);
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
	}

}
