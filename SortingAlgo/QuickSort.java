package SortingAlgo;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 7, 9, 1, 3));


        arr=Solution.quickSort(arr);
        
    for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i)+", ");
    }

    }
}

  class Solution {

   static int partition(List<Integer>arr ,int low,int high){
        int i=low;
        int j=high;
        int pivot=arr.get(low);

        while(i<j){
            while (arr.get(i)<=pivot && i<high) {
                i++;
            }
            while (arr.get(j)>=pivot&&j>low) {
                j--;
            }
            if(i<j){
                int temp=arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp=arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;

    }

   static void  qs(List<Integer>arr ,int low,int high){
if(low<high){
    int index=partition(arr, low, high);
    qs(arr, low, index-1);
    qs(arr,  index+1,high);

}
    }
   public static List<Integer> quickSort(List<Integer>arr){
    qs(arr,0,arr.size()-1);
    return arr;

    }
}
