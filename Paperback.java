/**
 * The Paperback class implements the PhysicalBook interface using the cost associated with Paperbacks
 *
 * @author Paul Deasy ID(118312303)
 */

public class Paperback implements PhysicalBook{
    private final int pageCount;
    private final Author author;
    private final Title title;
    private final Book.BookType type;
    public Paperback(Author author, Title title, int pageCount){
        this.type = BookType.PAPERBACK;
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
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

    @Override
    public int getPageCount() {
        return pageCount;
    }
}
