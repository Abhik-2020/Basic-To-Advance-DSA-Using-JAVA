import java.util.*;   // imports Scanner class for input

public class string_01{

    public static void main(String args[]){

        // String declaration examples
        // String str = " ";
        // str = "abhik";     // reassign string
        // str = "ashi";
        // System.out.println(str);

        // char array
        // char arr[] = {'a','b','c','d','e'};

        // different ways to create string
        // String str ="abcd";
        // String str2 = "abhik";
        // String str3 = new String("xyz");

        // NOTE: Strings are IMMUTABLE
        // immutable means once created, value cannot be changed

        // INPUT String
        Scanner sc = new Scanner(System.in); // scanner object

        // next() → reads only one word
        // String name;
        // name = sc.next();
        // System.out.println(name);

        // nextLine() → reads full sentence
        // String fullname = sc.nextLine();
        // System.out.println(fullname);

        // STRING LENGTH
        // String fullname = "abhik soni";
        // System.out.println(fullname.length());
        // length() counts spaces also

        // CONCATENATION (+ operator joins strings)
        // String firstName = "abhik";
        // String LastName = "soni";
        // System.out.println("your full name is: " + firstName + " " + LastName);

        // String fullname = firstName + " " + LastName;
        // System.out.println(fullname);

        // charAt(index) → returns character at given index
        String firstName = "Abhik";

        // prints character at index 0 → A
        System.out.println(firstName.charAt(0));
    }
}