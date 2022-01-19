import java.util.ArrayList;

public class PremiumUser extends User {

    /* instance variable */
    private String customTitle;

    public PremiumUser(String username, String bio) {
        /* TODO */
    }

    public String fetchMessage(MessageExchange me) {
        /* TODO */
        return null;
    }

    public String displayName() {
        /* TODO */
        return "<Premium> Marina";  // placeholder for checkpoint test.
                                    // replace it with your own after checkpoint submission.
    }

    public void setCustomTitle(String newTitle) {
        /* TODO */
    }

    public MessageExchange createModeratedRoom(ArrayList<User> users) {
        /* TODO */
        return null;
    }

    public boolean banUser(ModeratedRoom room, User u) {
        /* TODO */
        return false;
    }

    public boolean unbanUser(ModeratedRoom room, User u) {
        /* TODO */
        return false;
    }

    public boolean setNumVisibleLog(ModeratedRoom room, int newNum) {
        /* TODO */
        return false;
    }

}
