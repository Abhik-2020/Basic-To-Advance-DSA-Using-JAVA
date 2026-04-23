public class full_string_print_02 {

    // Method to print full string character by character
    public static void PrintFullString(String str){

        // loop runs from index 0 → last index
        for(int i = 0; i < str.length(); i++){

            // prints each character
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String args[]){

        // String variable
        String name = "abhik";

        // method call
        PrintFullString(name);
    }
}