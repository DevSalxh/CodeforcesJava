import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

public class B158_Taxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count1 = 0,count2 = 0,count3 = 0,count4 = 0;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            switch(value){
                case 1: count1 ++; break;
                case 2: count2 ++; break;
                case 3: count3 ++; break;
                case 4: count4 ++; break;
            }            
        }
        int taxiCount = count4;

        taxiCount += count3;
        count1 = Math.max(0,count1 - count3);

        taxiCount += count2/2;
        if (count2 % 2 !=0){
            taxiCount++;
            count1 = Math.max(0, count1 - 2);
        }

        if (count1 > 0){
            taxiCount += (count1 + 3)/4;
        }
        System.out.println(taxiCount);
    }
}