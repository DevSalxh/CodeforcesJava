import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] coins = new int[n];

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
            totalSum += coins[i];
        }

        Arrays.sort(coins);

        int mySum = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            mySum += coins[i];
            totalSum -= coins[i];
            count++;

            if (mySum > totalSum)
                break;
        }

        System.out.println(count);
    }
}