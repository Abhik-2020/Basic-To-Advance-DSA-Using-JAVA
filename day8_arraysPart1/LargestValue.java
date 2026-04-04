public class LargestValue {
    public static int largestvalue(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(number[i]>largest){
                largest = number[i];
            }
            
        }
     return largest;
    }
    public static void main(String []args){
        int marks[] = {66, 77, 88, 99};
        int maxmarks = largestvalue(marks);
        System.out.println("largest value is : " + maxmarks);
    }
    
}
