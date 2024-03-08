import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list ;
    public Heap(){
        list = new ArrayList<>();
    }

    private void swap(int first, int secound){
        T temp =  list.get(first);
        list.set(first, list.get(secound));
        list.set(secound, temp);
    }

    private int parent(int index){
        return (index-1)/2;
    }

    private int left(int index){
        return 2 * index + 1;
    }

    private int right(int index){
        return 2 * index + 2;
    }

    public void insert(T val){
        list.add(val);
        upHeap(list.size()-1);
    }

    private void upHeap(int index){
        if (index == 0){
            return;
        }
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p))<0){  // for max heap
            swap(index, p);
            upHeap(p);
        }
    }

    public T remove() throws Exception{
        if (list.isEmpty()){
            throw new Exception("Heap is empty");
        }

        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if (!list.isEmpty()){
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);
        if (left < list.size() && list.get(min).compareTo(list.get(left))>0){
             min = left;
//            swap(left, min);
//            downHeap(left);
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right))>0){
            min = right;
//            swap(right, min);
//            downHeap(right);
        }

        if (min != index){
            swap(min, index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> list1 = new ArrayList<>();
        while (!list.isEmpty()){
            list1.add(this.remove());
        }
        return list1;
    }
}
