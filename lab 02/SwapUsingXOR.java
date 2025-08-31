 
package swapusingxor;
 
public class SwapUsingXOR {
 
    public static void main(String[] args) {
        
        int a = 55, b = 23;
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
    
}
