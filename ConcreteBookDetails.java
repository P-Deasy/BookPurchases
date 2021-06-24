/**
 * Delegate class which facilitates the printing of the details of any given book
 *
 * @author Paul Deasy ID(118312303)
 */

public class ConcreteBookDetails {
    /**
     * Prints the details of a given book
     * @param book inputted book
     */
    public void printBookDetails(Book book){
        if (book instanceof Audiobook){
            System.out.println(book.getClass().getName() + " [ author = " + book.getAuthor().getName() + " title = "
                    + book.getTitle().getTitle() + " price = " + book.getPrice() + " duration = " +
                    ((Audiobook) book).getLength() + " ]");
        }
        else {
            System.out.println(book.getClass().getName() + " [ author = " + book.getAuthor().getName() + " title = "
                    + book.getTitle().getTitle() + " price = " + book.getPrice() + " page count = " +
                    ((PhysicalBook) book).getPageCount() + " ]");
        }
    }
}
