package CoustomQueue;

public class CircularQueue<E> {
    protected E[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int length){
        this.data = (E[]) new Object[length];
    }

    public boolean isFull() {
        return size == data.length;
    }
    private boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(E item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public E remove() throws Exception{
        if (isEmpty()){
            throw new Exception(("Queue is empty"));
        }
        E remData = data[front++];
        front = front % data.length;
        size--;
        return remData;
    }

    public void display() {
        if (isEmpty()){
            System.out.print("Empty");
            return;
        }
    int i = front;
    do {
        System.out.print(data[i]+" ");
        i++;
        i = i% data.length;
    }while (i != end);
        System.out.println(" End.");
    }

}
