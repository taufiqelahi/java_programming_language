package SortingAlgo;

public class InsertionShort {
    public static void main(String[] args) {
        int[] arr={13,132,1,10,2,32,45};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i;j>  0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k=0;k<=arr.length-1;k++){
            System.out.print(arr[k]+",");
        }
    }
   

}
