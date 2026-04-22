public class search_In_2d_array_matrix_staircaseMethod {
    
    public static void  search(int arr[][], int target){
        int row =0 , coloum = arr[0].length-1;
        
        while(row < arr.length && coloum >= 0){
            if(arr[row][coloum] == target){
                System.out.print("(" + row + "," + coloum + ")");
                return;
                
            }
            else if(arr[row][coloum] < target){
                row++;
            }
            else
                coloum--;
        }
        System.out.println("not found");

    }
        public static void main(String args[]){
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
                       search(arr, 100);
    }
}
