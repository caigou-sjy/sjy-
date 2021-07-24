package test;

/**
 * @title: Tree
 * @@Description:
 * @Author sujiaying@xiaomi.com
 * @Date: 2021/7/22 20:04
 */

public class Tree {
    public int index;
    public Tree(){}
    //根据数组创建先序二叉树
    public TreeNode createTree(int[] date) {
        TreeNode root = null;
        if (date == null || date.length == 0 ) return null;
        if( date[index]=='#') {
            return null;
        }
        root = new TreeNode(date[index]);
        System.out.println("create node:"+root.val);
        index+=1;
        root.left=createTree(date);
        index+=1;
        root.right=createTree(date);
        return root;
    }
    //先序遍历二叉树
    public void printTree(TreeNode root){
        if(root==null) return;
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }
}
