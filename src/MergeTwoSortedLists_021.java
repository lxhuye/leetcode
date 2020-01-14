//这个题目需要我们学习有关链表的知识
//思路很简单，创建一个新的链表，因为两个链表都是排序过后的链表，所以我们只需要将l1或者l2中较小的node放入新的链表
//注意会出现一个链表里面的数据已经全部加完， 另一个链表还有数据的情况，这时候需要我们将还有数据的链表加到我们新创建的链表中
public class MergeTwoSortedLists_021 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0);
            ListNode cur = dummy;
            while (l1 != null && l2 != null) {
                if (l1.val<l2.val){
                    cur.next=new ListNode(l1.val);
                    l1= l1.next;
                }else {
                    cur.next = new ListNode(l2.val);
                    l2=l2.next;
                }
                cur = cur.next;
            }
            if (l1==null){
                cur.next=l2;
            }
            else {
                cur.next=l1;
            }
            return dummy.next;
        }
    }
}
