package CycleQuestion;

public class CycleQuestions {
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast != slow){
                return true;
            }
        }
        return false;
    }


// find length of the cycle
public int lengthCycle(ListNode head){
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if (fast != slow){
            ListNode temp = slow;
            int length = 0;
            do {
                temp = temp.next;
                length++;
            }while (slow != fast);
            return length;
        }
    }
    return 0;
}

public ListNode middleNode(ListNode head){
       ListNode s = head;
       ListNode f = head;
       while (f != null && f.next != null){
           s = s.next;
           f = f.next.next;
    }
       return s;
}

}

class ListNode{
    int val;
    ListNode next;

    public ListNode(ListNode next) {
        this.next = next;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}