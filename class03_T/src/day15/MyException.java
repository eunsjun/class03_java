package day15;

public class MyException extends Exception {

	public MyException() {
		super("���� ����!!!");
	}

	public MyException(String message) {
		super(message);

	}

	public MyException(Throwable cause) {
		super(cause);

	}

	public MyException(String message, Throwable cause) {
		super(message, cause);

	}

	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
