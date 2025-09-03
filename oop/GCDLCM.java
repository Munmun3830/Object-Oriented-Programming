 
package gcdlcm;
public class GCDLCM {
    public static void main(String[] args) {       
        int num1 = 24;  
        int num2 = 36;  
        int a = num1;
        int b = num2; 
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        int lcm = (num1 * num2) / gcd;

        System.out.println("Numbers: " + num1 + ", " + num2);
        System.out.println("GCD of " + a + " and " + b + " = " + gcd);
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }
}

  