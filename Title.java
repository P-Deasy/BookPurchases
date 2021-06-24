/**
 * The title class allows for the creation of a title with allowances for if there is an alternate title
 *
 * @author Paul Deasy ID(118312303)
 */

public class Title {
    private final String title;
    public Title(String... t1){
        if (t1.length > 1){
            this.title = t1[0] + " / " + t1[1];
        }
        else {
            this.title = t1[0];
        }
    }

    /**
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }
}
