package LINKEDLIST;


import javax.swing.text.StyledEditorKit;

public class LL {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        ListNode node = new ListNode(val);
        node.next = head;   // head is null
        head = node; // now head is pointing towards node

        if (tail == null){  //for the first item tail is null
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        ListNode node = new ListNode(val);
        tail.next = node;
        tail  = node;
        size++;
    }

    public void insert(int val, int index){
        try {
            if (index > size) {
               throw new MyException("Can't access that index.");
            }
            if (index == 0) {
                insertFirst(val);
                return;
            }
            if (index == size) {
                insertLast(val);
            }
            // SAMJHO
            ListNode temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            ListNode node = new ListNode(val, temp.next);
            temp.next = node;
            size++;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Inserting the value using recursion
    public final void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }
    private ListNode insertRec(int value, int index, ListNode node){
        if (index == 0){
            ListNode temp = new ListNode(value, node);   //this node is referring to current node that means the temp node is pointing towards current node.
            size++;
            return temp;
        }
        node.next = insertRec(value, index-1, node.next);  // pointing at temp last recursion call end.
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if (size <= 1){
            deleteFirst();
        }
        ListNode lastIndex = get(size-2);
        int val = tail.value;
        tail = lastIndex;
        tail.next = null;

        return val;  // just returning value removed.
    }

    public void duplicate(){
        ListNode node = head;
        while (node.next != null){
            if (node.value == node.next.value) {
                node.next = node.next.next;
            }else {
                node = node.next;
            }
            size--;
        }
        tail = node;
        tail.next = null;
    }

    public static LL merge(LL first, LL second){
        ListNode f = first.head;
        ListNode s = second.head;

        LL ans = new LL();
        while (f != null && s != null){
            if (f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null){
         ans.insertLast(s.value);
         s = s.next;
        }
        return ans;
    }

    public ListNode get(int index){
        ListNode node = head;
        for (int i = 1; i < index; i++){
            node = node.next;
        }
        return node;
    }
    public ListNode findingIndex(int value){ // of given value.
        ListNode node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        ListNode prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        return val;
    }

    public void bubbleSort(){
        bubbleSort(size, 0);
    }

    private void bubbleSort(int row, int col){
        if (row == 0 ){
            return;
        }
        if (col < row) {
            ListNode first = get(col);
            ListNode second = get(col + 1);

            if (first.value > second.value) {
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    ListNode prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        }else {
            bubbleSort(row-1, 0);
        }
    }

    //Reverse using recursion.
    private void reverse(ListNode node){
        if (node == tail){
            head = tail;
            return;
        }

       reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private static class ListNode {

        private int value;
        private ListNode next;

        public ListNode(int value){
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
