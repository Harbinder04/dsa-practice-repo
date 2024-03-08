package CoustomStack;

public class CustomStack<E>{
    protected E[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = (E[]) new Object[size];
    }

    public boolean push(E item){
        if (isFull()){
            System.out.println("Stack is full.");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public E pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!");
        }
        E removed = data[ptr];
        ptr--;
        return removed;
    }

    public E peak() throws StackException{
        if (isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!");
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr == data.length - 1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
}
