package collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        
        final int LIMIT = 10; // limit 한계,제한
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();
        
        List list = new ArrayList(length / LIMIT + 10);
        
        for (int i = 0; i < length; i += LIMIT) { // 10개씩
            if (i + LIMIT < length)
                list.add(source.substring(i, i + LIMIT)); // 0 ~ 9번 까지 복사
            else
                list.add(source.substring(i));
        }
        
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
