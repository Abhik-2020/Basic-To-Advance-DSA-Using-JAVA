import java.util.*;
public class reverse_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");

        // int n = sc.nextInt();
        int n = 678;
        while(n>0){
            int last_digit = (n%10);
            System.out.print(last_digit);
            n = (n/10);
        }

    }
    
}
