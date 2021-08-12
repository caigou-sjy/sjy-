package test.meituan;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] date = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            date[i]=sc.nextInt();
            int max=0;
            for (int j = 1; j <i ; j++) {
                if(date[j]>max && date[j]<date[i]){
                    max=date[j];
                }
            }
            sum+=max*i;
        }
        System.out.println(sum);
    }
}
