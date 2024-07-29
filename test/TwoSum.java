package test;

public class TwoSum {
    public static void main(String[] args) {
        
        int[] a = new int[]{2,7,0,7};
        int t=9;
        for (int i=0;i<a.length-1;i++){
            for(int j=i+1;j<=a.length-1;j++){
               int sum=a[i]+a[j];
            if(sum==t){
                System.out.println(i+","+j);
            }
        }
    }
} 
}
