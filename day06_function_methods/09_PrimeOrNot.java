import java.util.*;
public class PrimeOrNot {
    public static boolean IsEven(int n){
        // boolean IsEvenNumber = true; // or use return
        if(n==2){
            return true;
        }
        // for(int i=2; i<=n-1; i++){ normal form to find prime or not
        for(int i=2; i<=Math.sqrt(n); i++){ // optimized form
            if((n%i) == 0){
                // IsEvenNumber = false; // or
                return false;
            }
        }
        // return IsEvenNumber; // or 
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(IsEven(n));
    }
}
    

