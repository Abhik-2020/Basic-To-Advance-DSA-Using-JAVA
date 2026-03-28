// this is example of : Call by value

// Call by value in Java means that when you pass a variable to a method, a copy of its value is sent—not the original variable itself. So any changes made inside the method do not affect the original variable.

public class swap_call_by_value{
    
    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("value of a is: "+ a);
        System.out.println("value of b is: " + b);
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        swap(a, b);
        

    }
}