package rollking.ARTS;

public class ReverseListNode {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(5);
        ListNode listNode2 = new ListNode(4, listNode);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(2, listNode3);
        ListNode listNode5 = new ListNode(1, listNode4);
        System.out.println(listNode5);
        System.out.println(reverse(listNode5));

        
    }
    
    private static ListNode reverse(ListNode listNode){
        if(listNode == null){
            return null;
        }
        ListNode pre = null;
        ListNode cur = listNode;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      public String toString() {
            StringBuilder sb = new StringBuilder("ListNode val :{" + val +
                    '}');
                    ListNode cur = this;
                while(cur.next != null){
                    sb.append("->"+ cur.next.val);
                    cur = cur.next;
                }
                return sb.toString();
        }  
}