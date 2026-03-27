//       *
//     * *
//   * * *
// * * * *


public class Question3 {
    public static void main(String srgs[]){
        int n=4;
        for(int i=1; i<=n; i++){
            
            for(int j=3; j>=i; j--){
                System.out.print(" ");  
            } 
            
            for(int s=1; s<=i; s++){
                System.out.print("*");
            }
            
            System.out.println();

            
        }
    }
    
}
