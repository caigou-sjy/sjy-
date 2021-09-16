package test.jingdong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stage = new int[n];
        String[] nstr = new String[n];
        List<ArrayList<Integer>> list = new ArrayList<>();
        int q = sc.nextInt();
        int[][] qs = new int[q][2];
        for (int i = 0; i < n; i++) {
            nstr[i] = sc.nextLine();
            System.out.println(nstr[i]);
        }
        for (int i = 0; i < n; i++) {
            String[] strings = nstr[i].split(" ");
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j <strings.length ; j++) {
                arrayList.add(Integer.valueOf(strings[j]));
            }
            list.add(arrayList);
            stage[i]=0;
        }

        for (int j = 0; j <q ; j++) {
            qs[j][0] = sc.nextInt();
            qs[j][1] = sc.nextInt();
            method(stage,list,qs[j]);
            int cnt=0;
            for (int i = 0; i < n; i++) {
                if(stage[i]==1){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
    public static void method(int[] stage,List list,int[] op){

        int now = op[1];
        int option = op[0];
        stage[now] = option;
        List<Integer> nowlist = (List<Integer>) list.get(now);
        if(nowlist.get(0)==0){
            return;
        }
        for (int i = 1; i < nowlist.size(); i++) {
            stage[nowlist.get(i)]=option;
            int[] newOp = {option,nowlist.get(i)};
            method(stage,list,newOp);
        }
    }
}
