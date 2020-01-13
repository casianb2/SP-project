
public class DocumentManager {
	private static Book _book;
	public static DocumentManager _instance = null;

	public Book getBook() {
		return _book;
	}
	public void setBook(Book b) {
		_book = b;
	}
	public static DocumentManager getInstance() {
		if (_instance == null) 
			_instance = new DocumentManager(); 
        return _instance; 
	}
}
