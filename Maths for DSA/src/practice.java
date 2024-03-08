public class practice {
    public static void main(String[] args) {
        // Defining the variables
        int max;

        // Initializing the array
        int a[] = { 70, 250, 50, 80, 140, 12, 14 };

        // Recursion - DAC_Max function called
        max = DAC_Max(a, 0, 7);
        System.out.printf("The maximum number in " +
                "a given array is : %d", max);
    }
        static int DAC_Max(int a[], int index, int l)
        {
            int max;
            if(l - 1 == 0)
            {
                return a[index];
            }
            if (index >= l - 2)
            {
                if (a[index] > a[index + 1])
                    return a[index];
                else
                    return a[index + 1];
            }

            // Logic to find the Maximum element
            // in the given array.
            max = DAC_Max(a, index + 1, l);

            if (a[index] > max)
                return a[index];
            else
                return max;
        }
}

