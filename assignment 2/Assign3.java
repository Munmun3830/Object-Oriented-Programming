
package assign.pkg3;
 
public class Assign3 {
 
    public static void main(String[] args) {
        int n = 9;
        int sum = 0;
        int odd;
        	
        System.out.print("The odd Numbers Are: ");
        
        for (int i=1; i<=n; i++)
        {
            odd = 2*i-1;
            System.out.print(odd+ " ");
            sum = sum+odd;
        }
        
        System.out.println ();
        System.out.println("The Sum of Odd Natural Number Upto " +n+ " Terms: " + sum);

    }
    
}
