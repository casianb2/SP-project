import java.util.LinkedList;

public class Subcapitol {
	private String _nume;
	private LinkedList<Element> _elemente;


	public Subcapitol(String nume) {
		_nume = nume;
		_elemente = new LinkedList<Element>();

	}

	public int addParagraf(Paragraph p) {
		_elemente.add(p);
		return _elemente.indexOf(p);
	}

	public Paragraph getParagrafByIndex(int i) {
		return (Paragraph) _elemente.get(i);
	}

	public int addImagine(Image i) {
		_elemente.add(i);
		return _elemente.indexOf(i);
	}

	public Image getImagineByIndex(int i) {
		return (Image) _elemente.get(i);
	}

	public int addTabel(Table t) {
		_elemente.add(t);
		return _elemente.indexOf(t);
	}

	public Table getTabelByIndex(int i) {
		return (Table) _elemente.get(i);
	}

	public String get_nume() {
		return _nume;
	}

	public int createNewImage(String nume) {
		Image c = new Image(nume);
		_elemente.add(c);
		return _elemente.indexOf(c);
	}

	public int createNewParagraph(String string) {
		Paragraph p = new Paragraph(string);
		_elemente.add(p);
		return _elemente.indexOf(p);
	}

	public int createNewTable(String string) {
		Table t = new Table(string);
		_elemente.add(t);
		return _elemente.indexOf(t);
	}

	public void print() {
		System.out.println(_nume + "\n");
		for (Element e : _elemente) {
			e.print();
		}
	}
}
