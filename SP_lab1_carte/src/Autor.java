
public class Autor {
	private String _nume;
	
	public Autor(String nume) {
		_nume = nume;
	}

	public String getNume() {
		return _nume;
	}

	public String toString() {
		return (_nume + "\n");
	}
	
	public void print() {
		System.out.println(toString());
	}
}
