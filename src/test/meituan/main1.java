package test.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycles = sc.nextInt();
        List<String> result = new ArrayList<>();
        for(int i=0;i<cycles;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] date = new int[n];
            int cnt=0,max=0;
            for (int j = 0; j < n ; j++) {
                if(cnt>=k){
                    break;
                }
                date[j] = sc.nextInt();
                if(date[j]<k){
                    cnt++;
                    if(max<date[j]){
                        max=date[j];
                    }
                }
            }
            if(cnt<k){
                result.add("No");
            }
            else{
                result.add("Yes");
                max+=1;
                result.add(String.valueOf(max));
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
