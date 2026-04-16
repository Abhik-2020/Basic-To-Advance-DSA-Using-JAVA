public class InsertionSort {

    // Method to perform Insertion Sort
    public static void insertionsort(int arr[]){

        // Loop starts from index 1 because first element is already sorted
        for(int i=1; i<arr.length; i++){

            // Store current element to insert in correct position
            int current = arr[i];

            // previous points to last index of sorted portion
            int previous = i-1;

            // Move elements of sorted portion that are greater than current
            // one position ahead to make space
            while((previous>=0) && (current < arr[previous])){
                arr[previous + 1] = arr[previous]; // shift element right
                previous--; // move left
            }

            // Place current element into correct position
            arr[previous+1] = current;
        }
    }

    // Method to print array elements
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " "); // print elements in one line
        }
    }

    // Main method → program starts here
    public static void main(String[] args) {

        // Declare and initialize array
        int arr[] = {5,4,1,3,2};

        // Call sorting method
        insertionsort(arr);

        // Print sorted array
        printarray(arr);
    }
}