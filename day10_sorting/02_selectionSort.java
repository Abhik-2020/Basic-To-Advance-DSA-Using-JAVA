public class selectionSort {

    // Method to perform selection sort
    public static void selection(int arr[]){
        int temp; // temporary variable used for swapping values

        // Outer loop → controls current position where smallest element should be placed
        for(int i=0; i<arr.length-1; i++){

            // Assume current index i has the smallest value
            int arrPosition = i;

            // Inner loop → find the actual smallest element in remaining unsorted array
            for(int j=i+1; j<arr.length; j++){

                // Compare current element with current minimum element
                if(arr[j] < arr[arrPosition]){
                    // If smaller element found, update index of smallest element
                    arrPosition = j;
                }
            }

            // After inner loop ends → arrPosition holds index of smallest element

            // Swap smallest element with element at position i
            temp = arr[i];                 // store current element
            arr[i] = arr[arrPosition];     // place smallest element at position i
            arr[arrPosition] = temp;       // put stored value at smallest element's old position
        }
    }

    // Method to print array elements
    public static void arrayprint(int arr[]){
        for(int i= 0; i<arr.length; i++){
            // Print each element followed by space
            System.out.println(arr[i]+ " ");
        }
    }

    // Main method → program execution starts here
    public static void main(String[] args) {

        // Declare and initialize array
        int arr[] = {64,25,12,22,11};

        // Call selection sort method
        selection(arr);

        // Print sorted array
        arrayprint(arr);
    }
}
