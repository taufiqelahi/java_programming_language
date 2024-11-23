package SortingAlgo;

public class BubbleShort {
    public static void main(String[] args) {
        
        int[] arr={13,132,1,10,2,32,45};
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
           

        }
        for(int k=0;k<=arr.length-1;k++){
            System.out.print(arr[k]+",");
        }
    }
}
