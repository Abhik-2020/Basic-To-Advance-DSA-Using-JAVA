// Class name
class Sum_Of_Digonals_03{

    // Method to calculate sum of diagonals
    public static int dsum (int arr[][]){

        int sum = 0; // variable to store sum

        // loop for rows
        for(int i=0; i<arr.length; i++){

            // loop for columns
            for(int j=0; j<arr[0].length; j++){

                // condition for primary diagonal
                // elements where row index == column index
                if(i == j){
                    sum += arr[i][j];
                }

                // condition for secondary diagonal
                // elements where row + column = n-1
                else if(i + j == arr.length - 1){
                    sum += arr[i][j];
                }
            }
        }

        return sum; // return final sum
    }

    public static void main(String[] args) {

        // 4x4 matrix
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // print diagonal sum
        System.out.println(dsum(arr));
    }
}