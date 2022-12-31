import java.util.Arrays;
import java.util.Scanner;

public class ThreeSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Sort012(arr);
        System.out.println(Arrays.toString(arr));
        input.close();
    }

    static void Sort012(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;
        while (mid <= hi) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, lo, mid);
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, hi, mid);
                    hi--;
            }
        }
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
