import java.util.*;
public class type_promotion1 {
    public static void main(String args[]){
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a + b + c);
        // java automaticlly promoted each byte, short, or char operator to int when evaluting expression
        System.out.print(bt);
    }
    
}
