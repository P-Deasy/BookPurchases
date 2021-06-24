/**
 * Delegate class which prints all the books owned by a given reader
 *
 * @author Paul Deasy ID(118312303)
 */

public class ConcreteOwnedBooks {
    /**
     * Prints all books owned by a person
     * @param person inputted person
     */
    public void printBooksOwned(Person person){
        System.out.println(person.getName() + " owns:");
        int x = 0;
        while (x < person.getBooksOwned().size()) {
            System.out.println(person.getBooksOwned().get(x).getTitle().getTitle());
            x+=1;
        }
    }
}
