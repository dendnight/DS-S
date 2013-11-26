package ds.s.exception;

public class MsgException extends Exception {

	private static final long serialVersionUID = -3300160368074348069L;

	public MsgException() {
		super();
	}

	public MsgException(String message, Throwable cause) {
		super(message, cause);
	}

	public MsgException(String message) {
		super(message);
	}

	public MsgException(Throwable cause) {
		super(cause);
	}

}
