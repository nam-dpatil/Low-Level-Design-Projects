package costomeException;

public class EmployeeNotFoundException extends RuntimeException {
	private String message;

	public EmployeeNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
	
}
