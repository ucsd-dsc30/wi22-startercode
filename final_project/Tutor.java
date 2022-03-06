public class Tutor extends User{


    public Tutor(String PID, String username){
        // TODO

    }

    public boolean answerQuestion(Post p, String response){
        // TODO
        return false;
    }

    @Override
    public String displayName() {
        // TODO
        return null;
    }

    @Override
    public boolean endorsePost(Post p){
        // TODO
        return false;
    }

    @Override
    public boolean editPost(Post p, String newText) {
        //TODO
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
