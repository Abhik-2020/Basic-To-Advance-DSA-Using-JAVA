import java.util.*;
public class binomial_function {

    
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
            
        }
        // System.out.println(fact);
        return fact;
    }
    public static int binomialcoffee(int n, int r){
        int f = factorial(n-r);
        int nf = factorial(n);
        int rf = factorial(r);
        int bino = nf/(rf*f); 
        return bino;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("write a number which you want to find his binomialcofee");
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.print(binomialcoffee(n, r));
    }
}
