public class diamondPattern {
    public static void diamondPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int s=1; s<=2*i-1; s++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int s=1; s<=2*i-1; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondPattern(4);
    }
    
}
