import java.util.*;
public class break_problem {
    public static void main(String args[]){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter your number");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
        }
    }
    
}
