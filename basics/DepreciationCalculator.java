import java.util.Scanner;

public class DepreciationCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Asset Value: ");
        double assetValue = sc.nextDouble();

        System.out.print("Enter Depreciation Rate (%): ");
        double rate = sc.nextDouble();

        double depreciation = (rate / 100) * assetValue;
        double currentValue = assetValue - depreciation;

        System.out.println("Depreciation Amount = " + depreciation);
        System.out.println("Current Asset Value = " + currentValue);

        sc.close();
    }
}