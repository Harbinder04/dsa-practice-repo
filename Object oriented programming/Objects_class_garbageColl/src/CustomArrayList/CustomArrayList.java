package CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public void CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int n){
        if (isFull()){
            reSize();
        }
        data[size++] = n;
    }

    private void reSize() {
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public void set(int index, int value){
        data[index] = value;
    }
   private int size(){
        return size;
   }

    @Override
    public String toString() {
        return  Arrays.toString(data) +
                ", size=" + size;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.CustomArrayList();
        list.add(4);
        list.add(5);
        list.add(46);
        list.set(2, 45);
        System.out.println(list);
    }
}

