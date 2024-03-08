package ArraysQuestion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 67};
        int target = 6;
        System.out.println(checkExist(arr, target, 0));
    }
    static boolean checkExist(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
            return arr[index] == target || checkExist(arr, target, index + 1);
    }
   static int checkIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return  checkIndex(arr, target, index+1);
    }
    static int checkIndexReverse(int[] arr, int target, int index){  // you have to provide argument with arr.length-1;
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return  checkIndexReverse(arr, target, index-1);
    }
}
