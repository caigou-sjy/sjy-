package test.alibaba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println(smallMax(list,k));
    }
    public static int smallMax(List<Integer> list,int k){
        if(list.isEmpty()){
            return 0;
        }
        Collections.sort(list);
        int oldMax = list.get(list.size()-1);
        System.out.println("odlmax="+oldMax);
        if(k<0){
            return oldMax;
        }
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum+=oldMax-list.get(i);
        }
        //System.out.println("sum="+sum);
        if(k<=sum){
            return oldMax;
        }
        else{
            int newMax = (int) (oldMax + Math.ceil((k-sum)/list.size()));
            return newMax;
        }
    }
}

