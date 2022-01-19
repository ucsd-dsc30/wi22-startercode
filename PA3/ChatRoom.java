import java.util.ArrayList;

public class ChatRoom implements MessageExchange {

    /* instance variables */
    private ArrayList<User> users;
    private ArrayList<Message> log;

    public ChatRoom() {
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

}