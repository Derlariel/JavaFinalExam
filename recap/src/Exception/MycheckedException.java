package Exception;

public class MycheckedException extends  Exception {
    public MycheckedException() {super();}
    public MycheckedException(String message) {super(message);}
    public MycheckedException(String message, Throwable cause) {super(message);}
}
