import java.util.Scanner;
import java.util.HashSet;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
 
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }

        int[] ans = new int[n];
        HashSet<Integer> set = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) {
            set.add(number[i]);
            ans[i] = set.size();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int q = scanner.nextInt();
            sb.append(ans[q - 1]).append("\n");
        }
 
        System.out.print(sb);
    }
}