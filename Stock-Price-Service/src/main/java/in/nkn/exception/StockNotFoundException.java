package in.nkn.exception;

public class StockNotFoundException extends RuntimeException {

	public static final long serialVersionUID = 1L;
	
	public StockNotFoundException(String message) {
		super(message);
	}
	
	

}
