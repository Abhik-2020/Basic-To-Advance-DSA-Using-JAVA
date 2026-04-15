import java.util.*;
public class area_of_circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your circle radius");
        float radius = sc.nextFloat();
    
        float area = 3.14f * radius * radius ;
        System.out.print(("This is your area of circle;- "+ area));


    }
    
}
