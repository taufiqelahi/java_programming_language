package test;

public class Type {
    public static void main(String[] args) {
        int a=dataTypeSize("Character");
        System.out.println(a);
    }
        static int dataTypeSize(String str) {
        if(str=="Character"){
            return 2;
        }else if(str=="Integer"){
            return 4;
        }else if(str =="Long"){
            return 8;
        }else if(str=="Float"){
            return 4;
        }else if(str=="Double"){
            return 8;
        }else {
            return -1;
        }
        // code here
    }
}
