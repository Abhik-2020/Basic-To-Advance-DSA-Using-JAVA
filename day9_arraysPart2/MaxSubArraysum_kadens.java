public class MaxSubArraysum_kadens {

    // Function to find maximum subarray sum using Kadane's Algorithm
    public static void kadens(int num[]) {

        // current sum stores sum of current subarray
        int currentsum = 0;

        // maxsum stores best (maximum) sum found so far
        int maxsum = Integer.MIN_VALUE;

        // loop through array
        for(int i = 0; i < num.length; i++) {

            // add current element to current sum
            currentsum = currentsum + num[i];

            // if current sum becomes negative,
            // reset it to 0 (because negative sum is useless)
            if(currentsum < 0) {
                currentsum = 0;
            }

            // update maxsum if currentsum is greater
            maxsum = Math.max(currentsum, maxsum);
        }

        // print final maximum subarray sum
        System.out.println("Max Sum Of Subarray Is: " + maxsum);
    }

    public static void main(String args[]) {

        // Test case 1 → all positive numbers
        int value[] = {2,4,6,8,10};
        kadens(value);

        // Test case 2 → mixture of positive & negative
        int marks[] = {-2,-3,4,-1,-2,1,5,-3};
        kadens(marks);
    }
}
