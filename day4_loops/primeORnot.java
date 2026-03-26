import java.util.Scanner;

public class primeORnot {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number to check prime or not");
        int n = sc.nextInt();

        Boolean isPrime = true;
        if(n == 2){
            System.out.println("is prime number");
        }

        else
        {for(int i=2; i<=(n-1);i++){
            if(n % i == 0){
                 isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("is prime number");
        }
        else{
            System.out.println("is not prime number");
        }}

    }
    
}
