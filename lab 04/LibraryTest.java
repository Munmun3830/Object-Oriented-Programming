 
package librarytest;
  
class Library {
    String bookName;
    String authorName;
    int quantity;

    Library(String bookName, String authorName, int quantity) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    void issueBook() {
        if(quantity > 0) {
            quantity--;
            System.out.println("Book issued: " + bookName);
        } else {
            System.out.println("Book not available: " + bookName);
        }
    }

    void returnBook() {
        quantity++;
        System.out.println("Book returned: " + bookName);
    }

    void displayBook() {
        System.out.println("Book: " + bookName + " | Author: " + authorName + " | Quantity: " + quantity);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Library b1 = new Library("Java Programming", "Herbert Schildt", 3);
        Library b2 = new Library("C++ Basics", "Bjarne Stroustrup", 2);
        Library b3 = new Library("Python Crash Course", "Eric Matthes", 1);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();

        b1.issueBook();
        b1.displayBook();

        b3.issueBook();
        b3.displayBook();

        b3.returnBook();
        b3.displayBook();
    }
}

 