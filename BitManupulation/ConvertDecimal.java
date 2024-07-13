package BitManupulation;

public class ConvertDecimal {
    public static void main(String[] args) {
        String x="1101";
        double a=0;
        
        for (int i=0;i<x.length();i++){
            if(x.charAt(x.length()-1-i)!='0'){
                a=a+Math.pow(2, i);

            }
        }
        System.out.println(a);
    }
    
}
