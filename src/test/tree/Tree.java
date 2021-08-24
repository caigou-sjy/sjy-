package test.tree;

import java.util.LinkedList;
import java.util.Queue;
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
        //System.out.println("create node:"+root.val);
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
    //Stack<TreeNode> stack = new Stack<>();
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
    public void floorOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        //入队
        queue.add(root);
        while (!queue.isEmpty()){
            //出队：移除头部元素并返回新头
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
    }

    //求深度
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    //求节点个数
    public int numOfTreeNode(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+numOfTreeNode(root.left)+numOfTreeNode(root.right);
    }

    //求左子节点之和
    public int sumOfLeftLeaves(TreeNode root){
        if(root==null) return 0;
        int leftVal = sumOfLeftLeaves(root.left);
        int rightVal = sumOfLeftLeaves(root.right);
        int midVal = 0;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            midVal = root.left.val;

        }
        return leftVal+rightVal+midVal;
    }

    //
}
