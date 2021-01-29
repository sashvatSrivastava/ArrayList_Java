import java.util.*;
public class ArrayListNew {
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);		
		System.out.println(numbers + "\n");
		
		numbers.remove(0);
		numbers.remove(1);
		
		System.out.println(numbers + "\n");		
		System.out.println(numbers.get(0) + "\n");		
		System.out.println(numbers.size() + "\n");
		
		numbers.set(0, 5);
		System.out.println(numbers + "\n");
		
		numbers.clear();
		System.out.println(numbers + "\n");
		
	}

	}
