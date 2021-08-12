package test.meituan;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num1 = new int[n/2];
        int[] num2 = new int[n/2];
        int cnt=0;
        for (int i = 0; i < n/2; i++) {
            num1[i]=sc.nextInt();
        }
        for (int i = 0; i < n/2; i++) {
            num2[i]=sc.nextInt();
            if(num1[i]!=num2[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
