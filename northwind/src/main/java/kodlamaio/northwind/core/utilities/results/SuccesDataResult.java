package kodlamaio.northwind.core.utilities.results;

public class SuccesDataResult<T> extends DataResult<T> {

	public SuccesDataResult(T data, String message) {
		super(data, true,message); //base sınıfına yani DataResulta true bilgisini gönderdik. Baseİn constructorına
	}
	
	public SuccesDataResult(T data) {
		super(data, true);
	}
	
	public SuccesDataResult(String message) {
		super(null,true, message);
	}
	
	public SuccesDataResult() {
		super(null,true);
	}
	
}
