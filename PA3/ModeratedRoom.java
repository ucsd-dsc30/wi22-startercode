import java.util.ArrayList;
import java.util.List;

public class ModeratedRoom implements MessageExchange {
    /* instance variables */
    private ArrayList<User> users, banned;
    private ArrayList<Message> log;
    private User moderator;
    private int numVisibleLog;

    public ModeratedRoom(PremiumUser moderator) {
        /* TODO */
    }

    public ArrayList<Message> getLog(User requester) {
        /* TODO */
        return null;
    }

    public boolean addUser(User u) {
        /* TODO */
        return false;
    }

    public boolean removeUser(User requester, User u) {
        /* TODO */
        return false;
    }

    public ArrayList<User> getUsers() {
        /* TODO */
        return null;
    }

    public boolean recordMessage(Message m) {
        /* TODO */
        return false;
    }

    public boolean banUser(User requester, User u) {
        /* TODO */
        return false;
    }

    public boolean unbanUser(User requester, User u) {
        /* TODO */
        return false;
    }

    public boolean setNumVisibleLog(User requester, int newNum) {
        /* TODO */
        return false;
    }
}
