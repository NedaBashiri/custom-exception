package exception;

public class NullCountryNameException extends Exception{

    public NullCountryNameException() {
        super();
    }

    public NullCountryNameException(String message) {
        super(message);
    }
}
