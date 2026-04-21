import java.util.*;

public class reverse_the_given_number {
    public static void main(String args[]){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int number =  sc.nextInt();

        int reverse = 0;

        while(number>0){
            int lastDigit = number%10;

            int reversed_number = (reverse*10)+ lastDigit ; 
            System.out.print(reversed_number);
            number = number/10;
        }
        


    }
    
}
