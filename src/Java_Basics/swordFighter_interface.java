package Java_Basics;



interface SwordFighter
{
static int maxSwordsWielded=2;
abstract  void escape();
abstract  void showWeapon();
abstract  void attack();


}

class Knight implements SwordFighter {

 @Override
 public void attack() {
     System.out.println("Knight stops the horse and attacks");
 }

 @Override
 public void escape() {
     System.out.println("Knight climbs the horse and flees");
 }
@Override
 public void showWeapon() {
     System.out.println("Shows Sword");
 }
 // please write the showWeapon() method for the Knight class here.
 // It should print out "Shows Sword" in a new line
}

class Ninja implements SwordFighter {
 
 @Override
 public void attack() {
     System.out.println("Ninja steps forward and attacks");
 }

 @Override
 public void escape() {
     System.out.println("Ninja gets into forest and flees");
 }

  @Override
 public void showWeapon() {
     System.out.println("Shows Katana");
 }
}

public class swordFighter_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Maximum swords that can be wielded: "+ SwordFighter.maxSwordsWielded);

	     Knight knight = new Knight();
	     Ninja ninja = new Ninja();

	     knight.showWeapon(); 
	     ninja.showWeapon();

	     knight.attack(); 
	     ninja.attack();

	     knight.escape();
	     ninja.escape();
	}

}
