package arraylist_implementation;

public class ArrayList_Test {
    
    public static void main(String[] args) {   
        ArrayList numbers = new ArrayList();
        
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
//        System.out.println(numbers);
        
//        numbers.add(1, 15);
//        System.out.println(numbers);
        
//        numbers.addFirst(5);
//        System.out.println(numbers);
        
//        System.out.println("\nremove: " + numbers.remove(1));
//        System.out.println(numbers);
//        
//        System.out.println("\nsize: " + numbers.size());
        
//        numbers.removeFirst();
//        System.out.println(numbers);
        
//        numbers.removeLast();
//        System.out.println(numbers);
        
//        System.out.println(numbers.get(0));
//        System.out.println(numbers.get(1));
//        System.out.println(numbers.get(2));
//        System.out.println(numbers.get(3));
        
//        System.out.println("\nindex: " + numbers.indexof(10));
//        System.out.println("\nindex: " + numbers.indexof(20));
//        System.out.println("\nindex: " + numbers.indexof(30));
//        System.out.println("\nindex: " + numbers.indexof(40));
        
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }
        
        ArrayList.ListIterator li = numbers.listiterator();
        
//        while(li.hasNext()) {
//            System.out.println(li.next());
//        }
        
//        while(li.hasPrevious()) {
//            System.out.println(li.previous());
//        }
        
//        while (li.hasNext()) {
//            int num = (int) li.next();
//            if (num == 30) {
//                li.add(35);
//            }
//        }
//        System.out.println(numbers);
        
        while(li.hasNext()) {
            int num = (int) li.next();
            if(num==30) {
                li.remove();
            }
        }
        System.out.println(numbers);
    }
    
}
