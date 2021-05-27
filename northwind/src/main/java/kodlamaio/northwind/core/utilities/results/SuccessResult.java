package kodlamaio.northwind.core.utilities.results;

public class SuccessResult extends Result{
	public SuccessResult() { //mesaj vermek istemiyor, sadece işlem sonucunu döner
		super(true);
	}
	
	public SuccessResult(String message) {
		super(true,message);
	}
}
