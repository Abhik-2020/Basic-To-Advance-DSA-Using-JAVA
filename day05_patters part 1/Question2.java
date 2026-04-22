// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15

public class Question2 {
    public static void main(String args[]){
        int n=5;
        char ch = '1';


        // outer loop
        for(int i=1; i<=n; i++){
            
            // inner loop
            for(int j=2; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            
            System.out.println();
        }
    }
    
}
