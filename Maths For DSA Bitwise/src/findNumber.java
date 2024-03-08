public class findNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,4};
        System.out.println(findNum(arr));
    }

    private static int findNum(int[] arr) {
        int uniqueNum = 0;
        for (int n: arr) {
            uniqueNum ^= n;
        }
        return uniqueNum;
    }
}
