import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ch = new char[100];
        char[] v = {'a','e','i','o','u','y'};
        String word = scanner.next().toLowerCase().replaceAll("[aeiouyAEIOUY]", "");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word.length();i++)
        {
            sb.append(".");
            sb.append(word.charAt(i));
        }
        System.out.println(sb);
    }

}