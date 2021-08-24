package test.array;

import java.util.Scanner;

/**
 * @title: ArrayMain
 * @@Description:
 * @Author sujiaying@xiaomi.com
 * @Date: 2021/8/24 20:02
 */

public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateString = sc.next();
        String dateString1 = dateString.substring(1,dateString.length()-1);
        String[] dates = dateString1.split(",");
        int[] date = new int[dates.length];
        for (int i = 0; i < date.length; i++) {
            date[i]=Integer.valueOf(dates[i]);
        }

    }
}
