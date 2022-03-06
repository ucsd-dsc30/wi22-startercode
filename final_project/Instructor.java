import java.util.ArrayList;

public class Instructor extends User{

    public Instructor(String username) {
        // TODO
    }

    public boolean answerQuestion(Post p, String response) {
        // TODO
        return true;
    }

    @Override
    public boolean endorsePost(Post p) {
        // TODO
        return true;
    }

    @Override
    public String displayName() {
        // TODO
        return null;
    }

    public Post deletePost(Post p, PiazzaExchange piazza) {
        // TODO
        return null;
    }

    public boolean inactivatePiazza(PiazzaExchange piazza) {
        // TODO
        return true;
    }

    public boolean editPost(Post p, String newText){
        return false;
    }

    /**
     * get the top k urgent questions from a specific piazza
     *
     * @param pe the target Piazza
     * @param k the amount of urgent post that we want to get
     * @return the k urgent posts
     * @throws OperationDeniedException when the operation is denied
     */
    public Post[] getTopKUrgentQuestion(PiazzaExchange pe, int k) throws OperationDeniedException {
        // TODO
        return null;
    }
}
