 
package productofdigits;
public class ProductOfDigits {
    public static void main(String[] args) {
       int num = 1126; 
        int product = 2;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;    
            product *= digit;        
            temp /= 10;               
        }
        System.out.println("Number: " + num);
        System.out.println("Product of digits: " + product);
    }   
}
