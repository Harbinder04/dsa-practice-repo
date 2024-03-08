public class searching {
    public static void main(String[] args) {
        int[] arr = {-1, 3 ,4, 5, 67 , 4, 2,};
        int ans = linearSearch(arr, 4);
        int ans2 = linearSearch3(arr, -1);
        boolean ans1 = linearSearch2(arr, 89);
        System.out.println("Index NO.: "+ans);
        System.out.println("Present or not true/false :"+ans1);
        System.out.println("Element is : " +ans2);
    }
    static int linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return Integer.MAX_VALUE;  // The element of array must be equal to minus 1
        }
        for (int index = 0 ; index < arr.length ; index++){
            if(arr[index]== target){
                return arr[index];
            }
        }
        return Integer.MAX_VALUE;
    }
    static boolean linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return true;
            }
        }
        return false;
    }
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0 ; index < arr.length ; index++){
           if(arr[index]== target){
//               return index; // return 2
                 return arr[index]; // return 4
           }
        }
        return -1;
    }
}
