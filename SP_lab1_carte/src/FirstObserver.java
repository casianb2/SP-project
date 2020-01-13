
public class FirstObserver implements Observer{
	
	private static FirstObserver _fistObserver;
	public static FirstObserver _instance = null;

	public FirstObserver getFirstObserver() {
		return _fistObserver;
	}
	public void setFirstObserver(FirstObserver obs) {
		_fistObserver = obs;
	}
	public static FirstObserver getInstance() {
		if (_instance == null) 
			_instance = new FirstObserver(); 
        return _instance; 
	}

	public void update(String oldValue, String newValue) {
		System.out.println("First observer");
		System.out.println("old value: " + oldValue);
		System.out.println("new value: " + newValue);
	}
}
