public class MaxSubArraysum_Optimise {

    // function to find maximum subarray sum using prefix array method
    public static void MaxSubarraySum(int num[]){

        // store maximum sum found so far
        int Maxsum = Integer.MIN_VALUE;

        // create prefix array of same length
        int prefix[] = new int[num.length];

        // first prefix value is same as first element
        prefix[0] = num[0];

        // build prefix array
        // prefix[i] = sum of elements from index 0 to i
        for(int i = 1; i < num.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        // outer loop → starting index of subarray
        for(int i = 0; i < num.length; i++){

            // inner loop → ending index of subarray
            for(int j = i; j < num.length; j++){

                int currentsum;

                // if subarray starts from index 0
                if(i == 0){
                    currentsum = prefix[j];
                }
                // otherwise use prefix formula
                else{
                    // sum(i → j) = prefix[j] − prefix[i-1]
                    currentsum = prefix[j] - prefix[i-1];
                }

                // update maximum sum if current sum is larger
                if(currentsum > Maxsum){
                    Maxsum = currentsum;
                }
            }
        }

        // print final maximum subarray sum
        System.out.println(Maxsum);
    }

    public static void main(String args[]){
        int marks[] = {2,4,6,8,10};

        // call function
        MaxSubarraySum(marks);
    }
}
