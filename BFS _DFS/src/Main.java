public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = calculatePrefixSum(arr);

        // Printing prefix sum array
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i] + " ");
        }
    }

        public static int[] calculatePrefixSum(int[] arr) {
            int n = arr.length;
            int[] prefix  = new int[n];

            prefix[0] = arr[0];
            for(int i = 1; i < n; i++){
                prefix[i] = prefix[i - 1] + arr[i];
            }
            return prefix;
        }

}
