
import java.util.*;
public class Fc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try  {
        int n=sc.nextInt();
          
           for(int i=1;i<=10;i++){
           int  m=n*i;
            System.out.println( n+ "*" +i+ "="+m);
           }
           
    }finally{
sc.close();
    }
       
    }
}
