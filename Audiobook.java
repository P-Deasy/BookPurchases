/**
 * The audiobook class which adds the fuctionality to get the duration of the audiobook from books
 *
 * @author Paul Deasy ID(118312303)
 */

public class Audiobook implements Book{
    private final double length;
    private final Author author;
    private final Title title;
    private final BookType type;
    public Audiobook(Author author, Title title, double length){
        this.type = Book.BookType.AUDIOBOOK;
        this.author = author;
        this.title = title;
        this.length = length;
        author.publishBook(this);
    }

    @Override
    public void printBookDetails(){
        ConcreteBookDetails details = new ConcreteBookDetails();
        details.printBookDetails(this);
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    @Override
    public Title getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return type.getPrice();
    }

    /**
     *
     * @return the length of the audiobook
     */
    public double getLength() {
        return length;
    }
}
