 
package sumoddnumbers;
public class SumOddNumbers {
    public static void main(String[] args) {
       int n = 10;  
        int sum = 0;
        int i = 1;  
        while (i <= n) {
            sum += i;
            i += 2;  
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " = " + sum);
    } 
}
