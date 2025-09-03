 
package twoscomplement; 
public class TwosComplement { 
    public static void main(String[] args) { 
         int binary = 10101;  
        int original = binary; 
        int onesComplement = 0;
        int place = 1;
        int temp = binary;

        while (temp > 0) {
            int digit = temp % 10;
            int flipped = (digit == 0) ? 1 : 0;  
            onesComplement += flipped * place;
            place *= 10;
            temp /= 10;
        } 
        int twosComplement = 0;
        int carry = 1;
        place = 1;
        temp = onesComplement;
        while (temp > 0 || carry > 0) {
            int digit = temp % 10;
            int sum = digit + carry;
            twosComplement += (sum % 2) * place;
            carry = sum / 2;
            place *= 10;
            temp /= 10;
        }
        System.out.println("Original binary number: " + original);
        System.out.println("Two's complement: " + twosComplement);
    }    
}
