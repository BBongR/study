package test1;


public class Test1 {
    
    public static void main(String[] args) {
        String string = "12345";
        int a = Integer.valueOf(string)-5;
        System.out.println(a);
        
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(2));
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(4));
        
        String sub = string.substring(2, 4);
        
        System.out.println(string.substring(2, 4));
        
        
    }
    
}
