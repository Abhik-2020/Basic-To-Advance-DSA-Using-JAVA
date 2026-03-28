public class product_of_two_numbers_function {
    public static int product(int a, int b){
        int multiply = a*b;
        return multiply;
    }
    public static void main(String agrs[]){
        int a=5;
        int b=3;
        int pro = product(a, b);
        System.out.println("product of two number is: "+ pro);

            //  or 
        pro = product(7, 7);
        System.out.println("product of two number is: "+ pro);
    }
}
