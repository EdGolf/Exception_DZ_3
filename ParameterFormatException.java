package DZ_3;

public class ParameterFormatException extends RuntimeException{
    public ParameterFormatException(String param) {
        super("Illegal params format " + param);
    }
}