// Q3.
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

public class number_pattern_print {
    public static void main(String args[]){
        int n = 5;
        for(int line=1; line<=n; line++){
            for(int numbers=1; numbers<=line; numbers++){
                System.out.print(numbers+" ");
            }
          System.out.println();
        }
    }
    
}
