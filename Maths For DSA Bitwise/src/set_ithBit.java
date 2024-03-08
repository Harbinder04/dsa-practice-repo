public class set_ithBit {
    public static void main(String[] args) {
//        String binaryNumber = "1010110"; // Example binary number
//        int i = 4;                     // Example bit position
//
//        // Convert the binary number to an integer
//        int number = Integer.parseInt(binaryNumber, 2);
//
//        // Calculate the mask with the i-th bit set
//        int mask = 1 << i-1;
//
//        // Set the i-th bit to 1
//        int result = number | mask;
//
//        // Convert the result back to binary
//        String binaryResult = Integer.toBinaryString(result);
//
//        System.out.println("Original binary number: " + binaryNumber);
//        System.out.println("After setting the " + i + "-th bit: " + binaryResult);

        //other way to do
        int n = 86;
        int setBit = 3;
        int mask = 1 << setBit;
        int result = n | mask;
        String str = Integer.toBinaryString(result);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(str);
    }
}
