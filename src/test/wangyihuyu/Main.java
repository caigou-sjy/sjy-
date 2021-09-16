package test.wangyihuyu;

public class Main {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(judege(s));
    }
    public static boolean judege(String str1){
        StringBuffer sb = new StringBuffer(str1);
        sb.reverse();
        int cnt=0;
        char[] chars1 = str1.toCharArray();
        char[] chars2 = sb.toString().toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i]!=chars2[i]){
                cnt++;
            }
        }
        if(cnt>2){
            return false;
        }
        return true;
    }
}
