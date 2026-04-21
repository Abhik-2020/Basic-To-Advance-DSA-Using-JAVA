// break statement :- To exist the loops.
public class breaks {
    public static void main(String  args[]){
        int counter = 0;
        while(counter<=5){
            if(counter == 3){
                break;
            }
            System.out.println(counter);
            counter++;
        }
    }
    
}
