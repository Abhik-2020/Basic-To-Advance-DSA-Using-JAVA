public class hollowRumbus {
    public static void hollow_rumbus(int n){
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
             if(i==1 || j==1 || i==n || j==n)
                {
                System.out.print("*");
                }
             else
                {
                System.out.print(" ");
                }
            }
        System.out.println();
        }

    }
    public static void main(String[] args) {
        hollow_rumbus(5);
    }
    
}
