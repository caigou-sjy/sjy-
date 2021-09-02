package test.zijie;
import java.util.*;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] growup = new int[n][3];
        int[][] skill = new int[m][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                growup[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < 3; j++){
                skill[i][j] = sc.nextInt();
            }
        }
        int[] now = new int[3];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                now[j]+=growup[i][j];
            }
            if(now[1]>skill[i][1] && now[2]>skill[i][2] && now[3]>skill[i][3]){
                list.add(i);
            }
        }
        for(int i = 0;i<m-1;i++){
            if(i<list.size() ){
                System.out.printf(list.get(i)+" ");
            }
            else{
                System.out.printf("-1 ");
            }
        }
        int x = (int)list.size()-1;
        if(list.size()==m){
            System.out.printf(String.valueOf(list.get(x)));
        }else{
            System.out.printf("-1");
        }

    }
}