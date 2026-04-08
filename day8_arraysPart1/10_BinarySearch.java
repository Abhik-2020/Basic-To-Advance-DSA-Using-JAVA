public class BinarySearch{
    // public static int binarysearch(int number[], int key){
    //     int end = number.length - 1;
    //     int start = 0;
        

    //     while(start<=end){
    //         int mid = (start + end)/2;
    //         if(number[mid] == key){
    //             return mid;
    //         }
    //         if(number[mid]<key){
    //             start = mid + 1;
    //         }
    //         else{
    //             end = mid-1;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int marks[] = {1,2,3,4,5,6,7};
    //     int foundarks = binarysearch(marks, 5);
    //     System.out.println(foundarks);
    // }
    

    public static int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while (first <= last){
            int mid = (first+last) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] < target) {
                first = mid + 1;
            } 
            else {
                last = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int marks[] = {2, 4, 6, 8, 10};
        int index = search(marks, 8);
        System.out.println(index);
    }
}



    
