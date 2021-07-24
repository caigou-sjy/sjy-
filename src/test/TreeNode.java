package test;

/**
 * @title: TreeNode
 * @@Description:
 * @Author sujiaying@xiaomi.com
 * @Date: 2021/7/22 19:21
 */

public class TreeNode {
        public int val;
        public TreeNode left=null;
        public TreeNode right=null;
        public TreeNode(){}
        public TreeNode(int val){
            this.val = val;
        }
        public TreeNode(int val, TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }

}
