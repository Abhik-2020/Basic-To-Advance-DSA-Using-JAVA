public class LinearSearch{
    public static int linearsearch(int number[], int key){
        for(int i=0; i<=number.length; i++){
            if(number[i]==key){
             return i;
            }
        }
        return -1;
    }

    
    public static void main(String args[]){
        int marks [] = {56, 77, 88, 56, 57};
        int index = linearsearch(marks, 88);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("index value of key is : "+ index);
        }
        
    }
}
