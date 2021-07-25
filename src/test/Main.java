package test;

import test.tree.Tree;
import test.tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        int[] date = {1,2,4,'#','#',5,'#',6,'#','#',3,7,9,'#','#','#',8,'#','#'};
        Tree tree = new Tree();
        TreeNode root = tree.createTree(date);
        System.out.println("root:"+root.val);
        tree.preStackOder(root);
    }
}
