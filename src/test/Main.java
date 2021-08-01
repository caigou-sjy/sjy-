package test;

import test.link.Link;
import test.link.LinkNode;
import test.tree.Tree;
import test.tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        //int[] date = {1,2,4,'#','#',5,'#',6,'#','#',3,7,9,'#','#','#',8,'#','#'};
        int[] date = {1,2,'#','#',3,4,'#','#',5,'#','#'};
        Tree tree = new Tree();
        TreeNode root = tree.createTree(date);
        System.out.println("root:"+root.val);
        System.out.println(tree.sumOfLeftLeaves(root));


//        int[] date = {1,2,3,4,5};
//        Link link1 = new Link();
//        LinkNode head1 = link1.createTailLink(date);
//        link1.printLink(head1);
//        LinkNode headR=link1.reverseLink(head1);
//        link1.printLink(headR);

    }
}
