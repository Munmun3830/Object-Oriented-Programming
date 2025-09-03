 
package sumevennumbers;
public class SumEvenNumbers {
    public static void main(String[] args) {
       int n = 10;  
        int sum = 0;
        int i = 2;  
        while (i <= n) {
            sum += i;
            i += 2;  
        }
        System.out.println("Sum of even numbers from 1 to " + n + " = " + sum);
    } 
}
