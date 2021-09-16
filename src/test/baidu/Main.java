package test.baidu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] data = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j]=sc.nextInt();
            }
        }
        int newN = n*k;
        int[][] array=new int[newN][newN];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int r = k*i; r < k*(i+1); r++) {
                    for (int l = k*j; l < k*(j+1); l++) {
                        array[r][l] = data[i][j];
                    }
                }
            }
        }
        for (int i = 0; i < newN-1; i++) {
            for (int j = 0; j < newN-1; j++) {
                System.out.printf(String.valueOf(array[i][j])+" ");
            }
            System.out.println(String.valueOf(array[i][newN-1]));
        }
        for (int i = 0; i < newN-1; i++) {
            System.out.printf(String.valueOf(array[newN-1][i])+" ");
        }
        System.out.printf(String.valueOf(array[newN-1][newN-1]));
    }

}
