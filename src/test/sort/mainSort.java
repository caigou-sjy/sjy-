package test.sort;

public class mainSort {
    public static void main(String[] args) {
        int[] array = {3,2,5,8,4,7,6,9};
        new Sort().quickSort(array,0,7);
        for (int a: array
             ) {
            System.out.println(a+" ");
        }
    }
}
