import java.lang.Exception;
class UnpayableEmployeeException extends Exception {
    
    public UnpayableEmployeeException(String message) {
        super(message);
    }
}