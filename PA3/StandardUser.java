import java.util.ArrayList;
import java.util.List;

public class StandardUser extends User {

    /* Message to append when fetching non-text message */
    private static final String FETCH_DENIED_MSG =
            "This message cannot be fetched because you are not a premium user.";

    public StandardUser(String username, String bio) {
        /* TODO */
    }

    public String fetchMessage(MessageExchange me) {
        /* TODO */
        return null;
    }

    public String displayName() {
        /* TODO */
        return "Placeholder";  // placeholder for checkpoint test.
                               // replace it with your own after checkpoint submission.
    }
}
