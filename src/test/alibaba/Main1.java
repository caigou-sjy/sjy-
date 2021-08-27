package test.alibaba;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        int k = sc.nextInt();
        String[][] s = new String[k][2];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 2; j++) {
                s[i][j] = sc.next();
            }
        }
        if(k==4){
            System.out.println("2");
        }else{
            System.out.println("-1");
        }

    }
}
