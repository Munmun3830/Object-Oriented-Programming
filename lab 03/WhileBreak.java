 
package whilebreak;
 
public class WhileBreak {
 
    public static void main(String[] args) {
         char ch = 'a';
        while(ch <= 'z') {
            if(ch == 'k') {
                break;
            }
            System.out.print(ch + " ");
            ch++;
        }
    }
    
}
