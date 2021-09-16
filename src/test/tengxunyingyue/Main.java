package test.tengxunyingyue;

import test.link.Link;
import test.link.LinkNode;
import test.tree.Tree;
import test.tree.TreeNode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] datas = s.split(",");
        int m = Integer.valueOf(datas[0]);
        int k = Integer.valueOf(datas[1]);
        int result = method(m, k);
        System.out.println(result);
    }

    private static int method(int n, int k) {
        int cnt = 0;
        int m = 0;
        String res = "";
        while (cnt < n) {
            m++;
            String sb = "";
            int num = m;
            //sb：当前m转化为k进制
            while (true) {
                if (num / k != 0) {
                    sb = sb + String.valueOf(num / k);
                    num = num % k;
                } else {
                    sb = sb + String.valueOf(num % k);
                    break;
                }
            }
            //累积新出现的'1'
            for (Character c : sb.toCharArray()) {
                if (c == '1') {
                    cnt++;
                }
            }
            //累积拼接结果
            //res += sb;
            //System.out.println("res:" + res + " cnt:" + cnt);
        }
        return m;
    }

}
