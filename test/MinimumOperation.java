package test;

public class MinimumOperation {
   public static void main(String[] args) {
    
    int[] nums={3,6,9};
    int a=0;

    for(int i=0;i<nums.length;i++){
        if(nums[i]%3!=0){
           if((nums[i]+1)%3==0){
a=a+1;
           }else if((nums[i]-1)%3==0){
a=a+1;
           }
        }
    }

    System.out.println(a);
   }
   
}
