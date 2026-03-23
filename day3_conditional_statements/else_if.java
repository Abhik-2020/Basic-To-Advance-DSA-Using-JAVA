public class else_if {
    public static void main(String args[]){
        int age = 16;
        if(age>=18){
            System.out.println("Adult");
        }
        else if(age>=13 && age<=18){
            System.out.println("teenagers"); 
            // elseif only check when if codition is false  

        }
        else{
            System.out.println("cild");
        }
    }

    
}
