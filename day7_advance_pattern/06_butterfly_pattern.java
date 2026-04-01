public class butterfly_pattern {
    public static void ButterFly(int n){
        // -first half
        for(int i=1; i<=n; i++){
            // -star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // -space
            for(int s=1; s <= (2*(n-i)); s++ ){
                System.out.print("  ");
            }
            // star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // -second half
        for(int i=n; i>=1; i--){
            // -star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // space
            for(int s=1; s <= (2*(n-i)); s++ ){
                System.out.print("  ");
            }
            // star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // nextline
            System.out.println();

        }
    }
    public static void main(String[] args) {
        ButterFly(5);
    }
}
