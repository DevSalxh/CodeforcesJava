import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int exp1 = a + b + c;
        int exp2 = a * b * c;
        int exp3 = a + b * c;
        int exp4 = a * b + c;
        int exp5 = a * (b + c);
        int exp6 = (a + b) * c;

        int max1 = Math.max(exp1, exp2);
        int max2 = Math.max(exp3, exp4);
        int max3 = Math.max(exp5, exp6);

        int result = Math.max(max1, Math.max(max2, max3));
        System.out.println(result);
    }
}