package test.tree;

public class TreeMain {
    public static void main(String[] args) {
        //int[] date = {1,2,4,'#','#',5,'#',6,'#','#',3,7,9,'#','#','#',8,'#','#'};
        int[] date = {1,2,'#','#',3,4,'#','#',5,'#','#'};
        Tree tree = new Tree();
        TreeNode root = tree.createTree(date);
        //tree.floorOrder(root);
        System.out.println(tree.maxDepth(root));
        System.out.println(tree.numOfTreeNode(root));
//        System.out.println("root:"+root.val);
//        System.out.println(tree.sumOfLeftLeaves(root));



    }
}
