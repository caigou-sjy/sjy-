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
        public TreeNode(int val){
            this.val = val;
        }
        public TreeNode(int val, TreeNode left,TreeNode right){
            this.left=left;
            this.val=val;
            this.right=right;
        }

}
