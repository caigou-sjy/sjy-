package test.tree;

import java.util.Stack;

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
    public void preOrder(TreeNode root){
        if(root==null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    //先序非递归遍历
    public void preStackOder(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || node!=null){
            while(node!=null){
                //首先一路到达最左，沿途输出并入栈
                System.out.println(node.val);
                stack.push(node);
                node=node.left;
            }
            //当node为null时停下，此时栈顶为此null的父节点，pop栈顶并将node跳到栈顶的右节点上
            //右节点非空继续按子树处理
            node=stack.pop().right;
            //右节点为空时，此null的父节点就是叶子节点，且在之前已被pop，此时栈顶是此null的父的父
            //它(此null的父的父)的左子树已处理完，pop栈顶在跳到栈顶的右子树继续处理
        }
    }
    //按层遍历

}
