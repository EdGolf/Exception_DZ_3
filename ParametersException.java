package DZ_3;


public class ParametersException extends RuntimeException {
    public ParametersException(int arrayLength, String message) {
        super(arrayLength > 6 ? message + " // You input more than 6 params" : message +" // You input less than 6 params");
    }
}