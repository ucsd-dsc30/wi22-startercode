public class Question extends Post {

    boolean answered;
    ArrayList<String> answers;

    /**
     * Constructor of Question
     * @param poster the poster of this question
     * @param header the summary of this question
     */
    public Question(User poster, String header, String UID) {
        // TODO
    }

    /**
     * Overloaded constructor for Question. With more specifications
     *
     * @param poster The poster of this question
     * @param header the summary header of this question
     * @param question the question body
     * @param keyword the keywords of the question
     * @param PEID the unique identification ID of course ID
     */
    public Question(User poster, String header, String question, String keyword, String PEID, String UID){
        // TODO
    }

    /**
     * getter method for text
     */
    public String getText(User u) throws OperationDeniedException {
        // TODO
        return null;
    }

    /**
     * Getting the status of this question
     *
     * @return the status of the question
     */
    public String getStatus(){
        // TODO
        return null;
    }

    /**
     * To string method. Feel free to change it to anything
     * for debugging purposes
     */
    @Override
    public String toString() {
        // TODO
        return null;
    }

    /**
     * answer this post
     *
     * @param s the answer of this question
     * @return whether the action is successful
     */
    public boolean answerQuestion(String s) {
        // TODO
        return false;
    }
}
