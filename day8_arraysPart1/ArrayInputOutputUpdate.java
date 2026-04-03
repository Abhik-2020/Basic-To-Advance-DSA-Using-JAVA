import java.util.*;

public class ArrayInputOutputUpdate{
    public static void main(String args[]){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();  //input in arrays
        marks[1] = sc.nextInt();  //input in arrays
        marks[2] = sc.nextInt();  //input in arrays

        marks[1] = 100;           //updation of arrays
        marks[0] = marks[0] + 1;  //updation of arrays

        System.out.println("phyics masrks = " +marks[0]);    //output in arrays
        System.out.println("maths marks = " + marks[1]);     //output in arrays
        System.out.println("chemistry marks = " + marks[2]); //output in arrays

        
    }
}