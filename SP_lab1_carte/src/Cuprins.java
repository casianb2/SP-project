
public class Cuprins {
	private String _txt;

	public Cuprins() {
	}
	public Cuprins(String txt) {
		_txt = txt;
	}
	public String get_txt() {
		return _txt;
	}

	public void set_txt(String _txt) {
		this._txt = _txt;
	}

	public String toString() {
		return (_txt + "\n");
	}
}
