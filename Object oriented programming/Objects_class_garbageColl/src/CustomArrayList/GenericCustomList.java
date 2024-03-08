package CustomArrayList;

import AbstractClasses.Parent;

import java.util.Arrays;

public class GenericCustomList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public GenericCustomList(){
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()){
            reSize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }
    private void reSize(){
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T)data[--size];
        return (T)removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){return size;}
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "GenericCustomList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        GenericCustomList<Integer> list = new GenericCustomList<Integer>();
        list.add(3);
        list.add(9);
        list.remove();
        System.out.println(list);
    }
}
