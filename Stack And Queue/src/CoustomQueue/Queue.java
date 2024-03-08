package CoustomQueue;

public class Queue<E>{
    protected E[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public Queue(){
        this(DEFAULT_SIZE);
    }
    public Queue(int size){
        this.data = (E[]) new Object[size];
    }

    public boolean isFull() {
        return end == data.length;
    }
    private boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(E item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public E remove() throws Exception{
        if (isEmpty()){
            throw new Exception(("Queue is empty Underflow!!"));
        }
        E remData = data[0];
        for (int i = 1; i < data.length; i++){
            data[i-1] = data[i];
        }
        end--;
        return remData;
    }

    public E front() throws Exception{
        if (isEmpty()){
            throw new Exception(("Queue is empty"));
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("-> end");
    }
}
