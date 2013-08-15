package cz.velim.sandbox.exceptions;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public MyException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
	

}
