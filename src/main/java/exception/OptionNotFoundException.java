package exception;

public class OptionNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    public static final String OPTION_NOT_FOUND = "OPTION NOT FOUND AMONG THE SELECTION LIST";

    public OptionNotFoundException(String e) {
        super(e);
    }
}
