public class findDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
    static int findDuplicate(int[] arr){
        int i = 0;
        while (i < arr.length){
            if(arr[i] != i + 1){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else{
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int start , int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;
    }
}
