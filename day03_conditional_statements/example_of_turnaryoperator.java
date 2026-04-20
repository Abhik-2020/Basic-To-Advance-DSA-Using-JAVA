import java.util.Scanner;

public class example_of_turnaryoperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String fail_pass = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(fail_pass);


    }
    
}
