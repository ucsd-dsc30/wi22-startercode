public class PhotoMessage extends Message {

    /* Error message to use in OperationDeniedException */
    private static final String INVALID_INPUT =
            "The source path given cannot be parsed as photo.";

    /* instance variable */
    private String extension;

    public PhotoMessage(User sender, String photoSource)
                        throws OperationDeniedException {
        /* TODO */
    }

    public String getContents() {
        /* TODO */
        return null;
    }

    public String getExtension() {
        /* TODO */
        return null;
    }

}
