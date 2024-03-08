public class bankAccountQ {
    static int MaxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person< accounts.length ; person++){
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                sum = sum + accounts[person][account];
            }
            //Now we have sum of accounts of person
            //Check With overall sum .
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {2, 5, 3, 2},
                {3,4 ,5 }
        };
        int ans1 = MaxWealth(arr);
        System.out.println(ans1);
    }
}
