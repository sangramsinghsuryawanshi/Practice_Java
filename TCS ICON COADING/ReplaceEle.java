/*
Replace each element of the array by its rank in the array

Input: Array: [20, 10, 30, 40]
*/
import java.util.*;

public class ReplaceEle {
    public static void isEI(int[] a) {
        // Create a list from the original array
        List<Integer> originalList = new ArrayList<>();
        for (int n : a) {
            originalList.add(n);
        }

        // Create a sorted copy of the list to determine ranks
        List<Integer> sortedList = new ArrayList<>(originalList);
        Collections.sort(sortedList);

        // Create a map to store the rank of each unique element
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sortedList.size(); i++) {
            // Only assign rank if the key is not already present (to handle duplicates)
            if (!rankMap.containsKey(sortedList.get(i))) {
                rankMap.put(sortedList.get(i), i + 1); // Rank is index + 1
            }
        }

        // Create the output array to store the ranks
        int[] output = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            // Replace each element with its rank from the map
            output[i] = rankMap.get(a[i]);
        }

        // Print the resulting ranks
        System.out.println(Arrays.toString(output));
    }

    public static void main(String[] ar) {
        int[] a = {20, 10, 30, 40};
        isEI(a);
    }
}
