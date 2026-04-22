public class search_In_2d_array_matrix_burutalforce {
    public static void search(int arr[][], int target ){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == target){
                    System.out.print( "("+ i + "," + j + ")" );
                    
                }
            }
        }
        
    } 
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
                       search(arr, 8);
    }
    
}
