public class ArraysAsAFunctionArguments {

    public static void update(int marks[], int nonchangeable){

        // Primitive variable → passed by value
        // So this change affects only local copy, NOT original variable
        nonchangeable = 10;

        // Array → reference is passed by value
        // Both 'marks' and original array point to SAME array object
        // So modifying elements WILL affect original array
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]){
        int marks[] = {77, 88, 99};
        int nonchangeable = 5;

        update(marks, nonchangeable);

        // Will print 5 because primitive was passed by value
        System.out.println(nonchangeable);

        // Loop should be < not <= otherwise ArrayIndexOutOfBoundsException
        for(int i=0; i<marks.length; i++){
            // Will print updated values (78, 89, 100)
            // because array elements were modified
            System.out.println(marks[i] + " ");
        }
    }
}
