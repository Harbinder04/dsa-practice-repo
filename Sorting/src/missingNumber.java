public class missingNumber {
    static int cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if ( arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++){
            if(index != arr[index]){
                return index;
            }
        }
        return arr.length;
    }
        static void swap ( int[] arr, int start, int second){
            int temp = arr[start];
            arr[start] = arr[second];
            arr[second] = temp;
        }

    public static void main(String[] args) {
        int[] arr = {0,1, 3};
        int ans = cyclic(arr);
        System.out.println(ans);
    }
}
