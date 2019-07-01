package Java_Basics;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iterator_sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Float> random=new ArrayList<Float>();
		random.add(2f);
		random.add(4f);
		random.add(5f);
		random.add(10f);
		random.add(99.9f);
		random.add(101f);
		iteratebkwd(random);
		
		
	}

	public static void iteratebkwd(List<Float> num)
	{
		ListIterator<Float> it=num.listIterator(1);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
