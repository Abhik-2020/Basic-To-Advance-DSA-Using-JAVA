public class factorial_function {
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
         return f;      
    }
    public static void main(String args[]){
        int n=5;
        int fac= factorial(n);
        System.out.println("factorial of the number is : "+ fac);

         // or

        System.out.println(factorial(6));
        
    }
    
}
