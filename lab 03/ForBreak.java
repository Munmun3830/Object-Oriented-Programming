 
package forbreak;
 
public class ForBreak {
 
    public static void main(String[] args) {
         
        for(char ch = 'a'; ch <= 'z'; ch++) {
            if(ch == 'o') {
                break;
            }
            System.out.print(ch + " ");
        }
    }
}
 