import java.util.ArrayList;

/**
 * The author class which adds functionality to the Person class to be able to hold the books published by th author
 *
 * @author Paul Deasy ID(118312303)
 */

public enum Author implements Person{
    JD_Sallinger("JD Sallinger"), JRR_Tolkein("JRR Tolkien");
    private final String name;
    private double funds;
    private final ArrayList<Book> books;
    private final ArrayList<Book> booksPublished;

    Author(String name){
        this.name = name;
        this.funds = 0;
        this.books = new ArrayList<Book>();
        this.booksPublished = new ArrayList<Book>();
    }
    @Override
    public void addBook(Book book){
        this.books.add(book);
    }

    public void publishBook(Book book){
        this.booksPublished.add(book);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getEarnings(){
        return  funds;
    }

    @Override
    public void charge(double value) {
        funds = funds - value;
    }

    @Override
    public void receive(double value) {
        funds = funds + value;
    }

    @Override
    public void buy(Book book) {
    ConcretePurchasingHandler transact = new ConcretePurchasingHandler();
    transact.purchase(this, book);
    }

    @Override
    public ArrayList<Book> getBooksOwned(){
        return books;
    }

    @Override
    public  void printBooksOwned(){
        ConcreteOwnedBooks booksOwned = new ConcreteOwnedBooks();
        booksOwned.printBooksOwned(this);
    }


    /**
     * Prints all books published by the author
     */
    public void printBooksPublished(){
        System.out.println(getName() + " published:");
        int x = 0;
        while (x < booksPublished.size()) {
            System.out.println(booksPublished.get(x).getTitle().getTitle());
            x+=1;
        }
    }
}
