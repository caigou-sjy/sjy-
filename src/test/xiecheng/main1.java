package test.xiecheng;

import java.util.Scanner;

/**
 * 平均值最大最长子序列
 */
public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = new int[2];
        int maxAv=0;
        int maxlth=k;
        for (int i = 0; i < n ; i++) {
            for (int j = i+k-1; j < n ; j++) {
                int av = 0, sum = 0;
                for (int l = i; l < j+1; l++) {
                    sum+=nums[l];
                }
                av=sum/(j-i+1);
                if(av>maxAv){
                    result[0]=i;
                    result[1]=j;
                    maxlth=j-i+1;
                    maxAv=av;
                }
                else if(av==maxAv && maxlth<(j-i+1)){
                    result[0]=i;
                    result[1]=j;
                    maxlth=j-i+1;
                }
            }
        }
        System.out.println(result[0]+" "+result[1]);
    }
}
