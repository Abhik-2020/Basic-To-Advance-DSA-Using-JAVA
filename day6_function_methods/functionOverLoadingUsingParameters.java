// Function overloading using parameters (Method Overloading in Java) means defining multiple methods with the same name but different parameter lists. The compiler decides which mfunctionOverLoadingUsingethod to call based on the number, type, or order of parameters.

import java.util.*;
public class Parameters {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(4, 5,6));
        System.out.println(sum(4, 5));
    }
}
