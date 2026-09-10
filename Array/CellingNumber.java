public class CellingNumber {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,8,9};

        int k = 6;

        int s = 0;
        int e = a.length - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (a[mid] == k) {
                System.out.println("Ceiling Index = " + mid);
                return;
            }

            if (a[mid] < k) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        if (s == a.length) {
            System.out.println("No Ceiling Exists");
        } else {
            System.out.println("Ceiling Index = " + s);
            System.out.println("Ceiling Value = " + a[s]);
        }
    }
}