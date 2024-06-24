package assertion;

public class AvailabilityAssertion extends AssertionError {

    public AvailabilityAssertion(String message, Throwable cause) {
        super(message, cause);
    }

    public static final String ERROR_AVAILABILITY = "THE ITEM IS NOT AVAILABLE FOR PURCHASE";

}