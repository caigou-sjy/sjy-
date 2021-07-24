package test;

public class Main {
    public static void main(String[] args) {
        //char[] date = {'1','2','4','#','#','5','#','6','#','#','3','7','9','#','#','#','8','#','#'};
        int[] date = {1,2,4,'#','#',5,'#',6,'#','#',3,7,9,'#','#','#',8,'#','#'};
        Tree tree = new Tree();
        TreeNode root = tree.createTree(date);
        System.out.println("root:"+root.val);
        tree.printTree(root);
    }
}
