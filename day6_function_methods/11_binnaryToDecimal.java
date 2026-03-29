public class binnaryToDecimal {
    public static int binary_to_decimal(int binnum){
        int mynumber = binnum;
        int pow = 0;
        int decimalnum = 0;
        while(binnum>0){
            int lastdig = (binnum % 10);
            decimalnum = decimalnum + (int)(lastdig*Math.pow(2, pow));
            binnum=binnum/10;
            pow++;
        }
        System.out.println("decimal number of give binary number " + mynumber+" : " + decimalnum);
        return decimalnum; 
    }
    public static void main(String args[]){
       binary_to_decimal(101);
        
    }
    
}
