 
package dowhilebreak;
 
public class DoWhileBreak {
 
    public static void main(String[] args) {
        
        char ch = 'a';
        do {
            if(ch == 'k') {
                break;
            }
            System.out.print(ch + " ");
            ch++;
        } while(ch <= 'z');
    }
}

    
    

