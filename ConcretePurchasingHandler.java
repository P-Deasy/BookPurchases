/**
 * Delegate class which conducts the purchasing of a book for any given buyer
 *
 * @author Paul Deasy ID(118312303)
 */

public class ConcretePurchasingHandler {
    /**
     * Facilitates the buying of books
     * @param person person buying the book
     * @param book book the person is buying
     */
    public void purchase(Person person, Book book){
        double price = book.getPrice();
        if (person.getEarnings() - price >= 0) {
            person.charge(price);
            Author author = book.getAuthor();
            author.receive(price * 0.1);
            person.addBook(book);
        } else {
            System.out.println("You don't have enough money to buy");
            book.printBookDetails();
        }
    }
}
