package p10exception.p01textbook.exercises.p07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		
	}
	
	public WrongPasswordException(String message) {
		super(message);
	}
	
	public WrongPasswordException(Throwable cause) {
		super(cause);
	}
}
