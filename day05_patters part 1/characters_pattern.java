// Q4.
// A 
// B C 
// D E F 
// G H I J 
// K L M N O

public class characters_pattern{
    public static void main(String args[]){
        int n = 5;
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int chars=1; chars<=i; chars++){
             System.out.print(ch+" ");
             ch++; 
            }
            System.out.println();
        }
    }
    
}
