package Merge_Sort;

public class MergeSort_2 {
   ListNode head;
    void insertLast(int val)
    {
        /* allocate node */
        ListNode node = new ListNode(val);

        /* link the old list of the new node */
        node.next = head;

        /* move the head to point to the new node */
        head = node;
    }

    public ListNode sortList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }
    ListNode merge(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    public void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(){
    }
}
