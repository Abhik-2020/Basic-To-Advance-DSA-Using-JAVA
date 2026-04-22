public class Sum_Of_Digonals_optimized_04 {

    // Function to calculate diagonal sum
    public static int dsum(int arr[][]){

        int sum = 0; // variable to store total sum

        // single loop runs for each row
        for(int i = 0; i < arr.length; i++){

            // PRIMARY diagonal (top-left → bottom-right)
            // elements where row index == column index
            sum += arr[i][i];

            // SECONDARY diagonal (top-right → bottom-left)
            // condition prevents middle element from being added twice
            if(i != arr.length - 1 - i){
                sum += arr[i][arr.length - 1 - i];
            }
        }

        return sum; // return total sum
    }

    public static void main(String arrg[]){

        // 4x4 matrix
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // print result
        System.out.println(dsum(arr));
    }
}