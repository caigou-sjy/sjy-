package test.wangyihuyu;

import com.sun.deploy.util.SyncAccess;

import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(method(s,k));
    }

    public static int method(String s, int k) {
        int[] dp = new int[s.length()];
        int max = 0;
        char[] chars = s.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            int newk = k , cnt = 0;
            for (int i = j; i < chars.length; i++) {
                if (chars[i] == '1') {
                    cnt++;
                    dp[j]=cnt;
                    max = Math.max(cnt, max);
                } else {
                    if (newk > 0) {
                        newk--;
                        cnt++;
                        dp[j]=cnt;
                        max = Math.max(cnt, max);
                    } else {
                        dp[j]=cnt;
                        max = Math.max(cnt, max);
                        break;
                    }
                }

            }
        }
        return max;
    }
}
