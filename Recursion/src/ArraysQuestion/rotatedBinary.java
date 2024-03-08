package ArraysQuestion;

public class rotatedBinary {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        int target = 4;
        int ans = rotatedSearch(arr, target, 0, arr.length-1);
        System.out.println("Index value is : "+ans);
    }
    static int rotatedSearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if (target <= arr[mid] && target >= arr[start]){
                return rotatedSearch(arr, target, start, mid-1);
            }else{
                return rotatedSearch(arr, target, mid + 1, end);
            }
        }
        if (target >= arr[mid] && target <= arr[end]){
            return rotatedSearch(arr, target, mid+ 1, end);
        }
            return rotatedSearch(arr, target, start, mid-1);
    }
}
