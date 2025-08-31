
package pyramidnumbers5to1;
 
public class PyramidNumbers5to1 {
 
    public static void main(String[] args) {
      for (int i = 5; i >= 1; i--) {           
          for (int j = 5; j >= 6 - i; j--) { 
                System.out.print(j + " "); 
            } 
            System.out.println(); 
        } 

    }
    
}
