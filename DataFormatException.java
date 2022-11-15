package DZ_3;

import java.util.Arrays;

public class DataFormatException extends RuntimeException{
    public DataFormatException(String[] params) {
        super("Date " + Arrays.toString(params) + " not exist");
    }
}
