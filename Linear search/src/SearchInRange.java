public class SearchInRange {
    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int index = start ; index <= end ; index++){
            int element = arr[index];
            if(element== target){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {18, 12, -4, 2, 4,28 ,30};
        int target = 18;
        System.out.println(linearSearch(arr, target,2,5));
    }
}
