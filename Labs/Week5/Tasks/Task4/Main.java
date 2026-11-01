package Labs.Week5.Tasks.Task4;
import Labs.Week5.Tasks.Task4.Packages.*;

public class Main {
    public static void main(String[] args) {
        
        Book[] books=new Book[2];

        books[0]=new Book("B-204","Clean Code","XYZ",true,new int[] {7,10,13});
        books[1]=new Book("B-205","Effective Java","XYZ",true,new int[] {5,7,9});

        books[0].issueBook();
        books[0].returnBook();
        books[0].issueBook();

        System.out.println("Books object created: "+Book.getBooksCreated());

        ReadingRoom obj=new ReadingRoom("R-1", 2);

        obj.occupySeat();
        obj.occupySeat();
        obj.occupySeat();
        obj.freeSeat();
        obj.display();

    }    
}
