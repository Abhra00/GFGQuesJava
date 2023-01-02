import java.util.ArrayList;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};
        System.out.println(duplicates(arr, 26).toString());
    }
    static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }
        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            if((arr[i] / n) > 1) {
                ans.add(i);
                flag = true;
            }
        }
        
        if(!flag) {
            ans.add(-1);
        }
        
        return ans;
    }
    
}
