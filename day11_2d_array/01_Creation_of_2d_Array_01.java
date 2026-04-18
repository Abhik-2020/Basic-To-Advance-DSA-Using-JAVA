import java.util.*;   // imports Scanner and other utility classes

public class Creation_of_2d_Array_01
{

    // function to search a key in 2D array
    public static void search(int arr[][], int key){

        int n = arr.length;        // number of rows
        int m = arr[0].length;     // number of columns

        // loop through rows
        for(int i=0; i<n; i++){

            // loop through columns
            for(int j=0; j<m; j++){

                // check if current element equals key
                if(arr[i][j] == key){

                    // print position if found
                    System.out.print("you found key at index " + "(" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String args []){

        int Array[][] = new int [3][3];   // create 3x3 2D array

        Scanner sc = new Scanner(System.in);  // input object
        
        int n = Array.length;        // rows
        int m = Array[0].length;     // columns

        // input elements into array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                Array[i][j] = sc.nextInt();   // take input
            }
        }
        
        // print array
        for(int i = 0; i<Array.length; i++){
            for(int j=0; j<Array.length; j ++){   // prints columns
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();   // next line after each row
        }

        search(Array, 4);   // call search function to find 4
    }
}
