package day42_ExceptionsContinue;

class FadyException extends RuntimeException {

    public FadyException(String message) {
        super(message);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        throw new FadyException("we can write message");
    }

    // we need to extend Runtime class

}
