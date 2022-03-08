import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Post implements Comparable<Post> {

    String UID;
    String parentPEID;
    int endorsementCount;
    boolean endorsedByCourseStaff;
    private String header;
    protected String text;
    boolean isPrivate;
    User poster;
    LocalDate date;
    int priority;
    private String keyword;

    /**
     * Constructor for Post
     *
     * @param poster the poster of the post
     * @param header the header of the post
     */
    public Post(User poster, String header, String UID) {
        // TODO
    }

    /**
     * Overloaded constructor for Post
     */
    public Post(User poster, String header, String text, String keyword, String PEID, String UID) {
        // TODO
    }

    /**
     * Getter method of the keyword of the post
     * @return the keyword of the post
     */
    public String getKeyword() {
        // TODO
        return null;
    }

    /**
     * Getter method of the text of the post
     * @return the text of the post
     */
    public abstract String getText(User u) throws OperationDeniedException;

    public LocalDate getDate() {
        // TODO
        return null;
    }

    /**
     * Set the date of the post to the provided new date
     * 
     * @param newDate the new date we are setting the post to
     */
    public void setDate(LocalDate newDate) {
        // TODO
    }

    public User getPoster() {
        // TODO
        return null;
    }

    public void editText(String text) {
        // TODO
    }

    public String toString() {
        // TODO
        return null;
    }

    /**
     * Compare two posts by their priority
     *
     * @param other the other post that we are comparing
     * @return whether this post is larger than the other post
     */
    public int compareTo(Post other){
        // TODO
        return 0;
    }

    public int calculatePriority() {
        return this.endorsementCount+(int)(this.date.until(LocalDate.now()).getDays()/3.0);
    }




}
