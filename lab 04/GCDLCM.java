 
package gcdlcm;
 
public class GCDLCM {
 
    public static void main(String[] args) {
       
        int a = 36, b = 60;
        int gcd = 1;

        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        int lcm = (a * b) / gcd;

        System.out.println("GCD of " + a + " and " + b + " = " + gcd);
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }
}

     