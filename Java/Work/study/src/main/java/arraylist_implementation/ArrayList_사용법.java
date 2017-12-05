package arraylist_implementation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_사용법 {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);

		numbers.add(1, 50);
		System.out.println(numbers);

		numbers.remove(2);
		System.out.println(numbers);

		System.out.println(numbers.get(2));

		System.out.println(numbers.size());

		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			int value = it.next();
			if (value == 30)
				it.remove();
			System.out.print(value + ", ");
		}
		System.out.println("\n" + numbers);

//		 for(int value : numbers) {
//		 System.out.println(value);
//		 }
	}

}
