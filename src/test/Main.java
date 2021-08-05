package test;

import test.link.Link;
import test.link.LinkNode;
import test.tree.Tree;
import test.tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        //int[] date = {1,2,4,'#','#',5,'#',6,'#','#',3,7,9,'#','#','#',8,'#','#'};
//        int[] date = {1,2,'#','#',3,4,'#','#',5,'#','#'};
//        Tree tree = new Tree();
//        TreeNode root = tree.createTree(date);
//        System.out.println("root:"+root.val);
//        System.out.println(tree.sumOfLeftLeaves(root));


        int[] date1 = {1,3,5,7};
        Link link1 = new Link();
        LinkNode head1 = link1.createTailLink(date1);
        link1.printLink(head1);
        System.out.println("marge");
        Link link2 = new Link();
        int[] date2 = {2,4,6};
        LinkNode head2 = link2.createTailLink(date2);
        link2.printLink(head2);
        System.out.println("=>");
        LinkNode sum = link1.mergeTwoAscLinks(head1,head2);
        link1.printLink(sum);
    }
}
