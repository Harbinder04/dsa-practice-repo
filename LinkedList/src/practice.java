import java.io.OutputStream;
import java.util.Arrays;

class LinkedList{
    private Node head;
   private Node tail;
   private int size;

   public void insert(int item){
      Node node = new Node(item);
      node.next = head;
      head = node;
      if (tail == null){
          tail = head;
      }
      size++;
   }

   public Node get(int index){
       Node temp = head;
       for (int i = 1; i < index; i++){
           temp = temp.next;
       }
       return temp;
   }
   public void delete(int index){
       if (head == null){
           System.out.println("List is empty");
       }
       if (index > size){
           System.out.println("IndexOutOfBound");
       }
      Node prev = get(index-1);
       prev.next = prev.next.next;
   }

   public void insertRec(int val, int index){
       if (index > size){
           System.out.println("IndexOutOfBound for your insertion.");
           return;
       }
       insertRec(val, index, head);
   }

   public Node insertRec(int val, int index, Node node){
       if (index == 0){
           Node temp = new Node(val, node);
           size++;
           return temp;
       }
       node.next = insertRec(val, index-1, node.next);
       return node;
    }
    public void display(){
       if(head == null){
           System.out.println("List is empty!");
       }
       Node temp = head;
       while (temp != null){
           System.out.print(temp.data+"-> ");
           temp = temp.next;
       }
        System.out.println("END");
    }
}

class Node{
    int data;
    Node next;

    public Node(){
    }
    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class practice {
        public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(56);
        list.insert(52);
        list.insert(57);
        list.delete(2);
        list.insertRec(14, 5);
        list.display();
      }
}