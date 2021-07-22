package test;

/**
 * @title: Tree
 * @@Description:
 * @Author sujiaying@xiaomi.com
 * @Date: 2021/7/22 20:04
 */

public class Tree {
    public TreeNode createTree(int[] date, int i, TreeNode root) {
        if (date == null || date.length == 0 || date[i] < 0) {
            return null;
        }
        TreeNode node = new TreeNode(date[i]);
        node.left=createTree(date,++i,node);
        node.right=createTree(date,++i,node);

        return node;
    }
}
