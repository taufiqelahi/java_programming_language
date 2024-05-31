package Strings;

public class ReversedString {

    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");

        for(int i =0;i<sb.length()/2;i++){
            int fontIndex=i;
            int backIndex=sb.length()-1-i;
            char fontChar=sb.charAt(fontIndex);
            char backChar=sb.charAt(backIndex);
            sb.setCharAt(fontIndex, backChar);

            sb.setCharAt(backIndex, fontChar);
            
            
        }
        System.out.println(sb);
    }
    
}
