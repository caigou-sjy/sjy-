package test.iqiyi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String deteString = sc.next();
        String[] dates = deteString.split(",");
        int[] date = new int[dates.length];
        for (int i = 0; i < date.length; i++) {
            if(!(dates[i] instanceof String)){
                System.out.println(0);
                return;
            }
            date[i]=Integer.valueOf(dates[i]);
        }
        int maxGap = maxGap(date);
        System.out.println(maxGap);
    }
    public static int maxGap(int[] date){
        if(date==null){
            return 0;
        }
        int maxGap=0;
        int p1=0,p2=0;
        int i=0;
        while(i<(date.length-1)){
            p1=i;
            if(date[i]<=date[i+1]) {
                while (i<(date.length-1) && date[i] <= date[i + 1]) {
                    i++;
                }
                p2 = i;
                maxGap = maxGap > Math.abs(date[p1] - date[p2]) ? maxGap : Math.abs(date[p1] - date[p2]);
            }
            else{
                while (i<(date.length-1) && date[i] > date[i + 1]){
                    i++;
                }
                p2 = i;
                maxGap = maxGap > Math.abs(date[p1] - date[p2]) ? maxGap : Math.abs(date[p1] - date[p2]);
            }
        }
        return maxGap;
    }
}
