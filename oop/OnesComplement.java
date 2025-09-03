 
package onescomplement;  
public class OnesComplement { 
    public static void main(String[] args) {
        int binary = 10101;  
        int original = binary;
        int complement = 0;
        int place = 1;
        while (binary > 0) {
            int digit = binary % 10;
            int flipped = (digit == 0) ? 1 : 0;  
            complement += flipped * place;
            place *= 10;
            binary /= 10;
        }
        System.out.println("Original binary number: " + original);
        System.out.println("One's complement: " + complement);
    }  
}
