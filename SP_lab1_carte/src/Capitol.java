import java.util.LinkedList;

public class Capitol {
	private String _nume;
	private LinkedList<Subcapitol> _subcapitole;

	public Capitol(String nume) {
		_nume = nume;
		_subcapitole = new LinkedList<Subcapitol>();
	}

	public void addSubcapitol(Subcapitol s) {
		_subcapitole.add(s);
	}

	public String get_nume() {
		return _nume;
	}

	public int createSubChapter(String nume) {
		Subcapitol c = new Subcapitol(nume);
		_subcapitole.add(c);
		return _subcapitole.indexOf(c);
	}

	public Subcapitol getSubChapter(int indexOfSubchapter) {
		return _subcapitole.get(indexOfSubchapter);
	}

	public String toString() {
		String str = _nume + "\n";
		for (Subcapitol s : _subcapitole) {
			str += s.toString();
		}
		return (str + "\n");
	}

	public void print() {
		System.out.println(toString());
	}
}
