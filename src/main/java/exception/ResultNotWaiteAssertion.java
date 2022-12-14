package exception;

public class ResultNotWaiteAssertion extends AssertionError {

    private static final long serialVersionUID = 1L;
    public static final String DEFAULT_WINDOW_ERROR = "DEFAULT WINDOW NOT FOUND";

    public ResultNotWaiteAssertion(String message, Throwable cause) {
        super(message, cause);
    }
}
