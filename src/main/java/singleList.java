public class singleList {


    // -----节点对应的数据结构-------
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }

        ListNode(int x) {
            this(x, null);
        }
    }

    // -----节点对应的数据结构-------

    // 链表头
    private ListNode head;

    // 向链表头添加元素
    public void addFirst(int i) {
        if (head == null) {
            head = new ListNode(i);
            return;
        }

        head = new ListNode(i, head);
    }

    // 遍历整个链表
    public void look() {
        if (head == null) {
            return;
        }
        ListNode tmp = head;
        while (tmp != null) {
            System.out.print(" " + tmp.val);
            tmp = tmp.next;
        }
    }

    // 反转链表 ---- 方法一:迭代法
    public void reverse() {
        head = reverseList(head);
    }

    // 注意这里的header是形参和本类中的链表头head不是一个,为了区分我加了个er
    // 下面这段代码,画个图可以很容易的进行理解
    private ListNode reverseList(ListNode header) {

        if (header == null || header.next == null) {
            return header;
        }

        ListNode reverse = reverseList(header.next);

        header.next.next = header;
        header.next = null;

        return reverse;
    }

    // 反转链表 ---- 方法二:指针挪动
    public void reverse2() {
        head = reverseList(head);
    }

    public ListNode reverseList2(ListNode header) {

        if (header == null || header.next == null) {
            return header;
        }

        // 将头赋给pre
        ListNode pre = header;
        // 现在的指针
        ListNode cur = header.next;

        // 如果现在的节点不是null,就继续遍历
        while (cur != null) {
            ListNode tmp = cur.next; // 临时变量
            // 将现在的指针指向前一个
            cur.next = pre;

            // 向后挪动指针
            pre = cur;
            cur = tmp;
        }
        // 别忘了将原来的头指针指向null
        header.next = null;

        return cur;

    }

    public static void main(String[] args) {
        singleList link = new singleList();

        for (int i = 4; i > 0; i--) {
            link.addFirst(i);
        }
        System.out.println("反转前:");
        link.look();

        System.out.println();
        System.out.println("迭代法反转后:");
        link.reverse();
        link.look();

        System.out.println();
        System.out.println("再次用指针移动法进行反转后:");
        link.reverse2();
        link.look();

    }

}
