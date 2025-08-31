 
package assign.pkg3;
 
public class Assign3 {
 
    public static void main(String[] args) {
        double num1 = 34.5;
        double num2 = 83.9;
        double num3 = 92.3;
        double Smallest;
        if (num1<=num2 && num1<=num3)
        {
            Smallest= num1;
        }
        else if(num2<=num1 && num2<=num3)
        {
            Smallest = num2;
        }
        else
        {
            Smallest = num3;
        }
        System.out.println("The Smallest Number is: " +Smallest);

    }
    
}
