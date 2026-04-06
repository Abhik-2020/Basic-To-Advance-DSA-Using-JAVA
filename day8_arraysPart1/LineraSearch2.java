public class LineraSearch2 {
    public static int linearSearch(String fruits[], String key){
        for(int i=0; i<fruits.length; i++){
            if(fruits[i] == key){
             return i;
            }
        }
        return -1;
    } 
    public static void main(String args[]){
        
        String fruits [] = {"mango", "apple", "pineapple", "grapes"};

        int fru = linearSearch(fruits, "apple");

        System.out.println("fruit which you want no found is : "+ fru );
    }
}
