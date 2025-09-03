 
package firstlastdigit;
public class FirstLastDigit {
    public static void main(String[] args) {
       int num =(1126);        
        int lastDigit = num % 10; 
        int firstDigit = num;
        while (firstDigit >= 10)
        {
            firstDigit /= 10;
        }
        System.out.println("Number: " + num);
        System.out.println("First Digit: " + firstDigit);
        System.out.println("Last Digit: " + lastDigit);
    }    
}
