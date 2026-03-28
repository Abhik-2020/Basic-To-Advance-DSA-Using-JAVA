import java.util.*;
public class function2 {
    public static void helloworld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    public static int addtwonumber(int a, int b){ //parameters
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        helloworld();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        addtwonumber(a, b);//arguments
        
    }
    
}
