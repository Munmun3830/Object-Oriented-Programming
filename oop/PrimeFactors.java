 
package primefactors; 
public class PrimeFactors { 
    public static void main(String[] args) {
      int num = 60;  
        int original = num;
        System.out.print("Prime factors of " + num + " are: "); 
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }
        int i = 3;
        while (i <= Math.sqrt(num)) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
            i += 2;
        } 
        if (num > 2) {
            System.out.print(num);
        }
    }
}
