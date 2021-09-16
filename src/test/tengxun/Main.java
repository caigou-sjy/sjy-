package test.tengxun;

import test.link.Link;
import test.link.LinkNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i]=sc.nextInt();
        }
        int cnt=0;
        for (int i = 0; i < data.length; i++) {
            int min1=data[i],min2=10000;
            for (int j = i+1; j < data.length; j++) {
                if(data[j]<=min2){
                    cnt+=1;
                    min2=data[j];
                }
                else {
                    min2=data[j];

                }
            }
        }
        System.out.println(cnt);
    }
}
