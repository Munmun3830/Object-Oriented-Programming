 
package swapfirstlastdigit; 
public class SwapFirstLastDigit { 
    public static void main(String[] args) {
       int num = (1126);  
        int last = num % 10; 
        int first = num; 
        while (first >= 10) {
            first = first / 10;
        }
        System.out.println("Original Number = " + num);
        System.out.println("First Digit = " + first);
        System.out.println("Last Digit = " + last);
        System.out.println("After Swapping: " + last + first);
    }  
}
