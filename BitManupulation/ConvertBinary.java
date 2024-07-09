package BitManupulation;

public class ConvertBinary {
   public static void main(String[] args) {
    int x=5;
    String res="";

    while (x>0) {
        if(x%2==1){
            res=res+"1";
        }else{
            res+="0";
        }
         x=x/2;
    }
    
    System.out.println("result "+res);
   }
}

