/**
 * The Book interface which outlines how information on individual books will be gotten i.e. author, price, title
 * .It also contains the enumerator BookType which sets the prices for each type of book.
 *
 * @author Paul Deasy ID(118312303)
 */

public interface Book{
    enum BookType {
        PAPERBACK(10.0), HARDBACK(12.0), AUDIOBOOK(15.0);
        private final Double price;
        BookType(Double price){
            this.price = price;
        }
        public double getPrice(){
            return price;
        }
    }

    /**
     *
     * @return The author of th book
     */
    public Author getAuthor();

    /**
     *
     * @return the title of the book
     */
    public Title getTitle();

    /**
     *
     * @return The price of the book
     */
    public double getPrice();

    /**
     * Prints all the details of the book
     */
    public void printBookDetails();
}
