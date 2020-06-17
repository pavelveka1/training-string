package by.epamtr.java.string;

public class InvalidPassedArgumentException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	 public InvalidPassedArgumentException() {
	        super();
	    }
	 
	 public InvalidPassedArgumentException(String message) {
	        super(message);
	    }
	 
	 public InvalidPassedArgumentException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 
	 public InvalidPassedArgumentException(Throwable cause) {
	        super(cause);
	    }

}
