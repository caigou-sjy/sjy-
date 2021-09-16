package test.tengxunyingyue;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String num="123";
        char[] chars = num.toCharArray();
        StringBuffer sb = new StringBuffer();
        int begin=0;
        int stop=0;
        for (int i = 0; i <num.length() ; i++) {
            if(chars[i]=='1'){
                continue;
            }
            else {
                begin=i;
                for (int j = i+1; j < num.length(); j++) {
                    if(chars[j]=='0'){
                        stop=j;
                    }
                    else {
                        break;
                    }
                }
            }
            break;
        }
        for (int i = begin; i <stop+1 ; i++) {
            chars[i]='1';
        }
        for (int i = 0; i < num.length(); i++) {
            sb.append(chars[i]);
        }
    }


}
