package SortingAlgo;

import java.util.ArrayList;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 10, 24 };

        ArrayList<Integer> a = new ArrayList<Integer>();

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] < arr[right]) {
                a.add(arr[left]);
                left++;
                System.out.println(left);
            } else {
                a.add(arr[right]);
                right--;
                System.out.println(right);
            }

        }
        System.out.println(left + "" + right);
        System.out.println(a);
    }
}