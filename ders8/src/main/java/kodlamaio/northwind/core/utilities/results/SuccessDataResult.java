package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {
	
	public SuccessDataResult(T data) {
		super(true, data);
	}
	
	public SuccessDataResult(String message, T data) {
		super(true, message, data);
	}
}
