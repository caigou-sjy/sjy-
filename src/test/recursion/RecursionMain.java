package test.recursion;

import java.util.Scanner;

/**
 * @title: RecursionMain
 * @@Description:
 * @Author sujiaying@xiaomi.com
 * @Date: 2021/8/27 11:02
 */

public class RecursionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = new RecursionMethods().jumpFloor(n);
        System.out.println(n);
    }
}
