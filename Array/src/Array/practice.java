package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        boolean ans = isMonotonic(arr);
        System.out.println(ans);
    }
    public static boolean isMonotonic(int[] nums) {
        return isInc(nums) || isDec(nums);
    }

    public static boolean isInc(int[] nums){
        boolean ans = false;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] <= nums[i+1]){
                ans = true;
            }else {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static boolean isDec(int[] nums){
        boolean ans = false;
        for(int i = nums.length-1; i > 0; i--){
            if(nums[i] <= nums[i-1]){
                ans = true;
            }else {
                ans = false;
                break;
            }
        }
        return ans;
    }
}

