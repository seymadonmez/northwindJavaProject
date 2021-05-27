package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data, String message) {
		super(data, false,message); //base sınıfına yani DataResulta false bilgisini gönderdik. Base'in constructorına
	}
	
	public ErrorDataResult(T data) {
		super(data, false);
	}
	
	public ErrorDataResult(String message) {
		super(null,false, message);
	}
	
	public ErrorDataResult() {
		super(null,false);
	}
	
}
