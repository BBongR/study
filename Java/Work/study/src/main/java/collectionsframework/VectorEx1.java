package collectionsframework;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3"); // size:3
        print(v); // capacity:5
        
        v.trimToSize(); // 빈 공간을 없앤다. (용량과 크기가 같아진다.)
        System.out.println("=== trimToSize() ===");
        print(v);
        
        v.ensureCapacity(6); // ensure 보장하다, Capacity 용량
        System.out.println("=== ensureCapacity(6) ===");
        print(v);
        
        v.setSize(7); // size를 capacity보다 크게 지정하였을 때, 기존 6개의 용량이 2배로 늘어 12개가 된다.
        System.out.println("=== setSize(7) ===");
        print(v);
        
        v.clear();
        System.out.println("=== clear(); ===");
        print(v);
    }
    
    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size:" + v.size());
        System.out.println("capacity:" + v.capacity());
    }
}
