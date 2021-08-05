package test.link;

public class Link {

    public LinkNode head = null;
    public LinkNode tail = null;

    public Link() {
    }

    //链表已经存在不可再重复创建

    public LinkNode createTailLink(int[] date) {
        for (int i = 0; i < date.length; i++) {
            if (head == null) {
                LinkNode node = new LinkNode(date[i], null);
                tail = head = node;
            } else {
                LinkNode node = new LinkNode(date[i], null);
                tail = tail.next = node;
            }
        }
//        System.out.printf("尾插： ");
//        printLink(head);
        return head;
    }

    public LinkNode createHeadLink(int[] date) {
        for (int i = 0; i < date.length; i++) {
            if (head == null) {
                LinkNode node = new LinkNode(date[i], null);
                tail = head = node;
            } else {
                LinkNode node = new LinkNode(date[i], null);
                node.next = head;
                head = node;
            }
        }
        //输出创建结果
        //System.out.printf("头插： ");
        //printLink(head);
        return head;
    }

    public void printLink(LinkNode h) {
        LinkNode p = h;
        while (p != null) {
            System.out.printf(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public LinkNode reverseLink(LinkNode h) {
        if (h == null || h.next == null) return h;
        LinkNode p = h;
        h = null;
        LinkNode q = null;
        while (p != null) {
            if (h == null) {
                h = p;
                p = p.next;
                h.next = null;
            } else {
                q = p;
                p = p.next;
                q.next = h;
                h = q;
            }
        }
        return h;
    }

    //两整数链表求和:输入两逆置链表，输出正序结果
    public LinkNode sumOfTwoLink(LinkNode h1, LinkNode h2) {

        if (h1 == null && h2 == null) {
            return null;
        } else if (h1 == null || h2 == null) {
            return h1 == null ? h2 : h1;
        }

        LinkNode p = h1, q = h2, cur = null, newHead = null;
        int carry = 0;
        while (p != null || q != null) {
            int val1 = p == null ? 0 : p.val;
            int val2 = q == null ? 0 : q.val;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            if (newHead == null) {
                newHead = new LinkNode(sum % 10);
            } else {
                cur = new LinkNode(sum % 10);
                cur.next = newHead;
                newHead = cur;
            }
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        return newHead;
    }

    //合并两个升序链表
    public LinkNode mergeTwoAscLinks(LinkNode h1, LinkNode h2) {
        if (h1 == null && h2 == null) {
            return null;
        } else if (h1 == null || h2 == null) {
            return h1 == null ? h2 : h1;
        }

        LinkNode p = h1, q = h2, tmp = null, newHead = null,tail = null;
        while (p != null && q != null) {
            if (p.val > q.val) {
                tmp = q;
                q = q.next;
            }else{
                tmp=p;
                p=p.next;
            }
            if (newHead == null) {
                tail = newHead = tmp;
            } else {
                tail = tail.next = tmp;
            }
            tail.next = null;
        }
        if(p!=null){
            tail.next=p;
        }else{
            tail.next=q;
        }
        return newHead;
    }

}
