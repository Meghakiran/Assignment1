import java.util.*;

public class ArrayTransformation {

    public static int minOperations(int[] arr, int n, int k) {
       
        int rem = arr[0] % k;
        for (int i = 1; i < n; i++) {
            if (arr[i] % k != rem) {
                return -1;
            }
        }
 Arrays.sort(arr);
int median = arr[n / 2];

       
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += Math.abs(arr[i] - median) / k;
        }

        return operations;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(minOperations(arr, n, k));
    }
}