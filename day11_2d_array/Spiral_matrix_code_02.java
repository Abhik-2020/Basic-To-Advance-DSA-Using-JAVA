public class Spiral_matrix_code_02 {
    public static void spiral(int arr[][]){
        int startRow = 0;
        int endRow = arr.length - 1;
        int startColoum = 0;
        int endColoum = arr[0].length - 1;

        while(startColoum<=endColoum  && startRow<=endRow){
            // top 
            for(int j=startColoum; j<=endColoum; j++){
                System.out.print(arr[startRow][j]+" ");
            }

            // right
            for(int i=startRow+1 ; i<=endRow; i++){
                System.out.print(arr[i][endColoum]+" "); 
            }

            // bottom
            for(int j=endColoum-1; j>=startColoum; j--){
                if(startColoum == endColoum){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }
            // left
            for(int i=endRow-1; i>=startRow+1; i--){
                 if(startRow == endRow){
                    break;
                }
                System.out.print(arr[i][startColoum]+" ");
            }
            startRow++;
            startColoum++;
            endRow--;
            endColoum--;
            
       }
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiral(arr);
    }
    
}
