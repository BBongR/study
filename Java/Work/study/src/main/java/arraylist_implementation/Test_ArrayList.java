package arraylist_implementation;

public class Test_ArrayList {
	public static void main(String[] args) {
	
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		System.out.println(numbers);
		
//		numbers.add(1, 15);
//		System.out.println(numbers);
//		
//		numbers.addFirst(5);
//		System.out.println(numbers);
		
		System.out.println(numbers.remove(1));
		System.out.println(numbers);
	}

}
