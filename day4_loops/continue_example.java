// display all number entered by user except multiple of 10.
import java.util.*;
public class continue_example {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }
            else{
                System.out.println("you entered this : "+ n);
                
            }
            
        }
    }
    
}
