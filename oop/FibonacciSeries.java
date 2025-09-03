 
package fibonacciseries; 
public class FibonacciSeries { 
    public static void main(String[] args) {
         int n = 10;  
        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        int count = 0;
        while (count < n) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            count++;
        }
    }
}
