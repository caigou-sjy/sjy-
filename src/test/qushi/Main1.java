package test.qushi;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String re = sc.next();
        String list = sc.next();

        String s1 = list.substring(1, list.length());
        String[] tpms = s1.split(",");

        Pattern pattern = Pattern.compile(re);

    }
}
