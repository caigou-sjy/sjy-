package test.kuangshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param nums int整型一维数组 每个跑步机最大步数
     * @return int整型
     */
    public int max_steps(int[] nums) {
        // write code here
        if(nums==null){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        List<Integer> list = new ArrayList<>();
        for (int n :
                nums) {
            list.add(n);
        }
        List<Integer> sortList = null;
        int newMax=list.size()-1;
        do {
            sortList = list;
            Collections.sort(sortList);
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]==sortList.get(newMax)){
                    if(i-1>=0){
                        nums[i-1]=0;
                    }
                    if(i+1<nums.length){
                        nums[i+1]=0;
                    }
                }
            }
            newMax--;
            if(newMax<0) break;
        }while(sortList.get(newMax)>0);
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
        }
        return sum;
    }
}