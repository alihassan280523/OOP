package Labs.Week5.Tasks.Task4.Packages;

public class Book {
    private final String id;
    private String title;
    private String author;
    private boolean status;
    private int[] loanDurations;
    private static int bookCount=0;

    public Book(String id,String title,String author,boolean status,int[] durations){

        this.id=id;
        this.title=title;
        this.author=author;
        this.status=status;
        this.loanDurations=durations;
        Book.bookCount++;
    }

    public void issueBook(){
        if(!status){
            System.out.println("Book not available");
        }
        else{
            status=false;
            System.out.println("\nBook Issued: "+this.id);
        }
    }

    public void returnBook(){
        System.out.println("\nBook returned: "+this.id);
        status=true;
    }

    public void updateLoanDays(int index,int days){
        if(index<0||index>2){
            System.out.println("\nIndex out of bound");
        }
        else if(days<=0){
            System.out.println("\nValue of days is invalid");
        }
        else{
            loanDurations[index]=days;
            System.out.println("\nDuration Days updated");
        }
    }

    public int calculateAverageLoanDays(){
        int sum=0;
        for(int i:loanDurations){
            sum+=i;
        }

        return (sum/3);
    }

    public void displayBook(){
        System.out.println("\nBook Id: "+id);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Available: "+status);
        System.out.println("Average loan duration: "+calculateAverageLoanDays());
    }

    public static int getBooksCreated(){
        return bookCount;
    }
}
