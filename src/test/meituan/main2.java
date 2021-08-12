package test.meituan;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date1 = sc.nextLine();
        String date2  = date1.replaceAll(" ","");
        //System.out.println(date2);
        char[] chars = date2.toCharArray();
        StringBuffer sb= new StringBuffer();
        sb.append(chars[0]);
        for (int i=1;i<chars.length;i++) {
            if(chars[i]==chars[i-1]){
                continue;
            }
            sb.append(chars[i]);
        }
        System.out.println(sb);


    }
}
