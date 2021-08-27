package test.recursion;

/**
 * @title: Recursion
 * @@Description:
 * @Author sujiaying@xiaomi.com
 * @Date: 2021/8/27 11:01
 */

public class RecursionMethods {
    public int jumpFloor(int target){
        if(target<1){
            return 0;
        }
        int sum=0;
        if(target==1){
            return 1;
        }
        else if(target==2){
            return 2;
        }
        sum = jumpFloor(target-1)+jumpFloor(target-2);
        //System.out.println("f("+target+")="+sum);
        return sum;
    }
}
