public class EvendigitQ {
    static int findNumber(int[] nums){
        int count = 0 ;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigit = digits(num);
        return numberOfDigit % 2 == 0;  // Return true of false.
    }
    static int digits(int num){
//        int count = 0 ;
//        while(num > 0 ){
//            num = num/10;
//            count++;
//        }
//        return count;

        //We can optimise this solution by below method :
        if(num < 0){
            num = num * (-1);
        }
        return (int)(Math.log10(num) + 1);
    }
    public static void main(String[] args) {
        int[] numbs = {12, 345, 2, 6, 7896};
        System.out.println(findNumber(numbs));
    }
}
