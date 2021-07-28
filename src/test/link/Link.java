package test.link;

public class Link {

    public LinkNode head=null;
    public LinkNode tail=null;
    public Link(){}

    //链表已经存在不可再重复创建

    public LinkNode createTailLink(int[] date){
        for (int i = 0; i < date.length; i++) {
            if(head==null){
                LinkNode node = new LinkNode(date[i],null);
                tail = head = node;
            }
            else{
                LinkNode node = new LinkNode(date[i],null);
                tail = tail.next = node;
            }
        }
//        System.out.printf("尾插： ");
//        printLink(head);
        return head;
    }
    public LinkNode createHeadLink(int[] date){
        for (int i = 0; i < date.length; i++) {
            if(head==null){
                LinkNode node = new LinkNode(date[i],null);
                tail = head = node;
            }
            else{
                LinkNode node = new LinkNode(date[i],null);
                node.next = head;
                head = node;
            }
        }
        //输出创建结果
        //System.out.printf("头插： ");
        //printLink(head);
        return head;
    }
    public void printLink(LinkNode h){
        LinkNode p = h;
        while (p!=null){
            System.out.printf(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
    public LinkNode reverseLink(LinkNode h){
        if(h==null || h.next==null) return h;
        LinkNode p = h;
        h = null;
        LinkNode  q = null;
        while (p!=null){
            if(h==null){
                h=p;
                p=p.next;
                h.next=null;
            }
            else{
                q = p;
                p=p.next;
                q.next = h;
                h=q;
            }
        }
        return h;
    }
}
