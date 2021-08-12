package test.meituan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycles = sc.nextInt();
        List<String> result = new ArrayList<>();
        for(int i=0;i<cycles;i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            int cnt = 0, max = 0;
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                list.add(num);
            }
            Collections.sort(list);
            if (k >= n ) {
                System.out.println("No");
            }
            else {
                max = list.get(k-1) + 1;
                if (max < n) {
                    System.out.println("Yes");
                    System.out.println(max);
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}
