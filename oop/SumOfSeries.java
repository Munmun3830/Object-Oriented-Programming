 
package sumofseries;
 
public class SumOfSeries {
 
    public static void main(String[] args) {
        int sum = 0;
        int term = 7;
        for (int i = 1; i <= 100; i++) {
            sum += term;
            term += 13;
        }
        System.out.println("Sum of series = " + sum);
    }
    
}
