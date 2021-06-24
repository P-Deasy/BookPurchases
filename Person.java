import java.util.ArrayList;

/**
 * The person interface outlines how get the various details of a person earnings, name, and books owned,. It also
 * allows them to receive and be charged money and also buy books
 *
 * @author Paul Deasy ID(118312303)
 */

public interface Person {
    /**
     * Charges a person a given amount of money
     * @param value amount charged
     */
    public void charge(double value);

    /**
     * Gives a person a given amount of money
     * @param value amount given
     */
    public void receive(double value);

    /**
     * Person buys given book
     * @param book book to be bought
     */
    public void buy(Book book);

    /**
     *
     * @return name of person
     */
    public String getName();

    /**
     *
     * @return total money of person
     */
    public double getEarnings();

    /**
     * Adds book to list of books owned by person
     * @param book given book
     */
    public void addBook(Book book);

    /**
     *
     * @return the array of books owned by a person
     */
    public ArrayList<Book> getBooksOwned();

    /**
     * Prints the books owned by a person
     */
    public  void printBooksOwned();
}
