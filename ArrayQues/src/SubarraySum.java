import java.util.ArrayList;
import java.util.Scanner;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int sum = input.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        ArrayList<Integer> res = subarraySum(arr, sum);
        System.out.println(res.toString());
        input.close();
    }

    static ArrayList<Integer> subarraySum(int[] arr, int s) {
        int n = arr.length;
        int start = 0;
        int last = 0;
        boolean flag = false;
        int currsum = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            currsum += arr[i];
            if (currsum >= s) {
                last = i;
                while (s < currsum && start < last) {
                    currsum -= arr[start];
                    ++start;
                }
                if (currsum == s) {
                    res.add(start + 1);
                    res.add(last + 1);
                    flag = true;
                    break;
                }
            }
        }
        if (flag == false) {
            res.add(-1);
        }
        return res;
    }
}