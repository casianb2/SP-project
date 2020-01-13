
public class SecondObserver implements Observer {
	
	private static SecondObserver _secondObserver;
	public static SecondObserver _instance = null;

	public SecondObserver getSecondObserver() {
		return _secondObserver;
	}
	public void setObserver(SecondObserver obs) {
		_secondObserver = obs;
	}
	public static SecondObserver getInstance() {
		if (_instance == null) 
			_instance = new SecondObserver(); 
        return _instance; 
	}
	public void update(String oldValue, String newValue) {
		System.out.println("Second observer");
		System.out.println("old value: " + oldValue);
		System.out.println("new value: " + newValue);
	}
}
