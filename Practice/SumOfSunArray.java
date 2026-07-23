import java.util.Arrays;

public class SumOfSunArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int target = 11;
        int sum = 0;
        int cnt = 0;

        Arrays.sort(a);

        for (int i = a.length - 1; i >= 0; i--) {
            if (sum >= target) {
                break;
            }
            sum += a[i];
            cnt++;
        }

        if (sum >= target) {
            System.out.println("Minimum number of elements required: " + cnt);
        } else {
            System.out.println("It's not possible to reach the target sum with the given elements.");
        }
        
        System.out.print("Sum: " + sum + " Count: " + cnt);
    }
}
