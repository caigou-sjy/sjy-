package test.qunaer;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    /* Write Code Here */
    public int solution(String str) {
        if(str == null){
            return 0;
        }

        int cnt=0;
        int lastn=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String string = str.substring(i,j+1);
                int n= (string.length()+2)/3;

                if(n<2){
                    continue;
                }
                char[] chars = string.toCharArray();
                boolean result = false;
                for (int k = 1; k <=n ; k++) {
                    if(chars[k-1]==chars[2*n-k-1] && chars[k-1]==chars[2*n+k-2-1] && n!=lastn){
                        result=true;
                        continue;
                    }
                    else{
                        result=false;
                        break;
                    }
                }
                if(result){
                    lastn = n;
                    cnt++;
                    //System.out.println(string);
                }
            }
        }
        return cnt;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strings = new String[n];
        int[] result = new int[n];
        int res;
        for (int i = 0; i <n ; i++) {
            strings[i] = in.next();
            res = new Solution().solution(strings[i]);
            result[i] = res;
        }
        for (int i = 0; i < n-1 ; i++) {

            System.out.println(result[i]);
        }
        System.out.print(result[n-1]);
    }
}

