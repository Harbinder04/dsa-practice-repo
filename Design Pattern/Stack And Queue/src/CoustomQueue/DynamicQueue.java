package CoustomQueue;

public class DynamicQueue<E> extends CircularQueue
{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int item){
        super(item);
    }

    @Override
    public boolean insert(Object item) {
        if (this.isFull()){
            E[] temp = (E[]) new Object[data.length*2];

            for (int i = 0; i < data.length; i++){
                temp[i] = (E) data[(front + i)% data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}
