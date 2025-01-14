package SortingAlgo;

public class BubbleSortRecursive {
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;
        sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }

    }

    static void sort(int arr[], int n) {
        if (n == 1)
            return;
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
        sort(arr, n - 1);
    };

}
