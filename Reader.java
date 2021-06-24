import java.util.ArrayList;

/**
 * The Reader class implements the person class exactly
 *
 * @author Paul Deasy ID(118312303)
 */

public class Reader implements Person{
    private String name;
    private double funds;
    private final ArrayList<Book> books;

    public Reader(String... name){
        this.name = name[0];
        int x = 1;
        while (x < name.length){
            this.name = this.name + " " + name[x];
            x += 1;
        }
        this.funds = 0;
        this.books = new ArrayList<Book>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getEarnings(){
        return funds;
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
    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public ArrayList<Book> getBooksOwned(){
        return books;
    }

    @Override
    public void  printBooksOwned(){
        ConcreteOwnedBooks booksOwned = new ConcreteOwnedBooks();
        booksOwned.printBooksOwned(this);
    }
}
