// // 1 2 3 4 5
// // 1 2 3 4
// // 1 2 3
// // 1 2
// // 1

// public class inverted_half_pyramid_withNumber{
//     public static void InvertedHalfPyramidWithNumber(int n){
//         for(int i=0; i<n; i++){
//             for(int j=1; j<=n-i; j++){
//             System.out.print(j);
//             }
//             System.out.println();
//         }
    
//     }
//     public static void main(String[] args) {
//         InvertedHalfPyramidWithNumber(5);
        
//     }



//                             or
// }// 1 2 3 4 5
// // 1 2 3 4
// // 1 2 3
// // 1 2
// // 1

public class inverted_half_pyramid_withNumber{
    public static void InvertedHalfPyramidWithNumber(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
            }
            System.out.println();
        }
    
    }
    public static void main(String[] args) {
        InvertedHalfPyramidWithNumber(5);
        
    }
}
