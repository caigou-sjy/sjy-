package test.link;

public class LinkMain {
    public static void main(String[] args) {
        int[] date1 = {1,9,5,2};
        Link link1 = new Link();
        LinkNode head1 = link1.createHeadLink(date1);
        link1.printLink(head1);
        System.out.println("+");
        Link link2 = new Link();
        int[] date2 = {5,6};
        LinkNode head2 = link2.createHeadLink(date2);
        link2.printLink(head2);
        LinkNode sum = link1.sumOfTwoLink(head1,head2);
        System.out.println("=");
        link1.printLink(sum);
    }
}
