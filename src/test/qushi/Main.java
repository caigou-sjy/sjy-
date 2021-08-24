package test.qushi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String s1 = string.replaceAll(" ","");
        System.out.println(s1);
        String[] chars = s1.split(",");
        List<Integer> list = new ArrayList<>();
        for (String st:
             chars) {
            list.add(Integer.valueOf(st));

        }

        int firstsum = firstSum(list);
        System.out.println(firstsum);
    }

    public static int firstSum(List<Integer> list){
        if(list==null || list.size()%2==1){
            return -1;
        }
        Collections.sort(list,(a,b)->b-a);
        int sum = 0 ;
        for (int i = 0; i < list.size(); i++) {
            if(i%2==0){
                sum+=list.get(i);
            }
        }
        return sum;
    }
}
