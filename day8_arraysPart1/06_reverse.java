public class reverse {
    public static void Reverse(int number[]){
        int firstNumb = 0;
        int lastNumb = number.length-1;
        int tem = 0;

        while(firstNumb<lastNumb){
            tem = number[lastNumb];
            number[lastNumb] = number[firstNumb];
            number[firstNumb] = tem;
            lastNumb--;
            firstNumb++;
        }
    }
    public static void main(String args[]){
        int marks[]= {2,4,6,8,10};
        Reverse(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");

        }
    }
}
