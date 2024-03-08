public class Reset_ith_bit {
    public static void main(String[] args) {
                int number = 42; // Example number
                int i = 1;      // Example  bit position

                // Calculate the mask with the i-th bit turned off
                int mask = ~(1 << i);

                // Reset the i-th bit to 0
                int result = number & mask;
         String binaryResult = Integer.toBinaryString(result);
        System.out.println("Original number: " + number);
        System.out.println("Original Number to binary: "+Integer.toBinaryString(number));
        System.out.println("After resetting the " + i + "-th bit: " + result);
        System.out.println("After resetting the " + i + "-th bit: " + binaryResult);
//        String binaryNumber = "111010"; // Example binary number
//        int i = 2;                     // Example bit position
//
//        // Convert the binary number to an integer
//        int number = Integer.parseInt(binaryNumber, 2);
//
//        // Calculate the mask with the i-th bit turned off
//        int mask = ~(1 << i-1);
//
//        // Reset the i-th bit to 0
//        int result = number & mask;
//
//        // Convert the result back to binary
//        String binaryResult = Integer.toBinaryString(result);
//
//        System.out.println("Original binary number: " + binaryNumber);
//        System.out.println("After resetting the " + i + "-th bit: " + binaryResult);
    }
}
