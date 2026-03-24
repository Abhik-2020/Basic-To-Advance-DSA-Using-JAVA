import java.util.*;

public class print_n_numbers_usingloops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        
        int counter = 0;
        while(counter <= range){
            System.out.println(counter);
            counter++;
        }




    }
}