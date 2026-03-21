public class example_of_type_promotion1 {
    public static void main(String args[]){
        byte b = 5;
        // byte a = b*2;
        // show error because in covert it to int and int data is not store in byte data type because int id big than byte therefore we need to use byte coverssion
        byte a = (byte)(b*2);
        System.out.println(a);
    }

    
}
