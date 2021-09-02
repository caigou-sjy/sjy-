package test.kuangshi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String dateString = sc.next();
        String dateString1 = dateString.substring(1,dateString.length()-1);
        String[] dates = dateString1.split(",");
        int[] date = new int[dates.length];
        for (int i = 0; i < date.length; i++) {
            date[i]=Integer.valueOf(dates[i]);
        }
        int sum = new Solution().max_steps(date);
        System.out.println(sum);
    }
}
