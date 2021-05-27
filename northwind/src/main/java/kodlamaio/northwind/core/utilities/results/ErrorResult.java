package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result{
	public ErrorResult() { //mesaj vermek istemiyor, sadece işlem sonucunu döner
		super(false);
	}
	
	public ErrorResult(String message) {
		super(false,message);
	}
}
