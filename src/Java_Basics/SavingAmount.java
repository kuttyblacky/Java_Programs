package Java_Basics;

public class SavingAmount {

	private int amount;
	
	public void setIntialSaving(int amount) {
		// TODO Auto-generated method stub
		this.amount=amount;
		
	}

	public int getAmount()
	{
			return this.amount;
	}

	public int decrementSaving() {
		// TODO Auto-generated method stub
		int amount=incrementSaving()-100;
		return amount;
	}
	

	public int incrementSaving() {
		// TODO Auto-generated method stub
		int amount=getAmount()+1000;
		return amount;
	}

	public void checkSaving() {
		if(decrementSaving()>=1000)
		{
			System.out.println("Congratulations! You have save a good amount");
		}
		else if(decrementSaving()<1000 && decrementSaving()>0)
		{
			System.out.println("Insufficient saving!");
		}
		else
		{
			System.out.println("Your are in debt");
		}
		// TODO Auto-generated method stub
		
	}

	public int getCurrentSaving() {
		// TODO Auto-generated method stub
	return this.decrementSaving();
	}
}
