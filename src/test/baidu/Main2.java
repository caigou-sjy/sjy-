package test.baidu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[] data = new int[n];
//        for (int i = 0; i < n; i++) {
//            data[i]=sc.nextInt();
//        }
//        for (int i = 0; i < n ; i++) {
//            int num=data[i];
//
//        }
        int k = sc.nextInt();
        String string = sc.next();
        char[] chars = string.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            Character c = string.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        int size=1;
        int result = 1;
        for (Character key: map.keySet()
             ) {
            result = result * map.get(key);
        }
        System.out.println(result+1);
    }
    public static int factorial(int n){
        int sum=1;
        while(n>0){
            sum=sum*n--;
        }
        return sum;
    }
    //Cn m nn=size
    public static int combination(int m,int n){
        return m<n? factorial(n)/(factorial(n-m)*factorial(m)):0;
    }
}
