import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(missingNumber(arr));
        input.close();
    }

    static int missingNumber(int[] arr) {
        cyclicSort(arr);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) {
                return i + 1;
            }
        }
        return -1;
    }
    static void cyclicSort(int[] arr) {
        int idx = 0;
        while(idx < arr.length) {
            int correctIdx = arr[idx]  - 1;
            if(arr[idx] < arr.length && arr[idx] != arr[correctIdx]) {
                swap(arr, idx, correctIdx);
            }
            idx++;
        }
    }
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
} 
