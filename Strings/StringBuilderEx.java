package Strings;
/**
 * StringBuilderEx
 */
public class StringBuilderEx {

    
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("world");
        System.out.println(sb);
       char index= sb.charAt(0);
       System.err.println(index);
       sb.setCharAt(2, 'a');
       System.out.println(sb);

    }
}