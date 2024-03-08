package ArraysQuestion;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8};
        boolean ans = recCall(arr, 0);
        System.out.println(ans);
    }
    static boolean recCall(int[] arr, int index){
        if(index  == arr.length-1){
            return true;
        }
        return (arr[index]< arr[index + 1] && recCall(arr, index+1));
    }
}
