public class type_promotion2 {
    public static void main(String args[]){
        int a = 10;
        float b = 20.25f;
        long c = 24;
        double d = 30;
        // if one operstor is long, flost, or doublre thr whole expreassion is promoted to long, float, or double repectively.
        // therfore here in this int ans shown errror
        // int ans = (a + b + c + d);
        // so that be need to use typecasting this convertion 

        int ans = (int) (a + b + c + d);


    }
    
}
