package BitManupulation;

public class Bits {
    public static void main(String[] args) {
        ///get bit operation find bit of pos  one or zero
        int n=5;
        int pos=2;
        
        int bitMask=1<<pos;
        int number=bitMask & n;
        if((bitMask & n)==0){
            System.out.println("number os zero");
            System.out.println(number);
        }else{
            System.out.println("number is one");
            System.out.println(number);
        }

        ///set bit  means set bit value 1;
        int newNumber=bitMask |n;
        if((bitMask | n)==0){
            System.out.println("number os zero");
            System.out.println(newNumber);
        }else{
            System.out.println("number is one");
            System.out.println(newNumber);

        }

        ///clear bit means set bit value as a zero

        int notBitMask=~(bitMask);
        int clearbit=notBitMask&n;
        System.out.println(clearbit);
    }
}
