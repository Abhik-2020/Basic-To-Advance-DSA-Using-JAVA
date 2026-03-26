// 12345
// 1234
// 123
// 12
// 1
public class Question1{
    public static void main(String[]args){

        int n=5;
        int num = n;
        
        for(int i=1; i<=n; i++){
            for(int number=1; number<=num; number++){
                System.out.print(number);
            }
            num--;
            
            System.out.println();
        }
    }
}