package test.tengxun;

import test.link.LinkNode;

public class Methods {
    public LinkNode solve (LinkNode[] a) {
        // write code here
        if(a==null){
            return null;
        }
        LinkNode[] heads= new LinkNode[a.length];
        for (int i = 0; i <a.length ; i++) {
            heads[i]=a[i];
        }
        LinkNode newh =null,tail=null;
        boolean flag=false;
        while(!flag) {
            int cntNull=0;
            for (int i = 0; i <heads.length; i++) {
                if(heads[i]!=null) {
                    LinkNode node = new LinkNode(heads[i].val,null);
                    if(newh==null){
                        tail = newh = node;
                    }
                    else{
                        node = new LinkNode(heads[i].val,null);
                        tail = tail.next = node;
                    }
                    heads[i]=heads[i].next;
                }
                else{
                    cntNull+=1;
                    if(cntNull==heads.length){
                        flag=true;
                        return newh;
                    }
                    continue;
                }
            }

        }
        return newh;
    }
}
