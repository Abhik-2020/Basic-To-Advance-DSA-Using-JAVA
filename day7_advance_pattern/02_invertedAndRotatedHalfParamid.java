public class invertedAndRotatedHalfParamid {
    public static void HalfParamid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int s=1; s<=i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HalfParamid(4);
    }
    
}
