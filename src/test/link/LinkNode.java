package test.link;

/**
 * @title: LinkNode
 * @@Description:
 * @Author sujiaying@xiaomi.com
 * @Date: 2021/7/22 19:22
 */

public class LinkNode {
    public int val;
    public LinkNode next=null;
    public LinkNode(int val){
        this.val = val;
    }
    public LinkNode(int val,LinkNode next){
        this.next=next;
        this.val=val;
    }
}
