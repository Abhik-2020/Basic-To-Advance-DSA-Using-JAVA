import java.util.*;
public class odd_even {
    public static void main(String args[]){
        
        System.out.print("check it is even or odd \nEnter number");
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%2 == 0){
            System.out.print("Even number");

        }
        else{
            System.out.print("Odd number");

        }

    }
    
}
