
public interface Element {
	public int add(Element e);
	public void remove(Element e);
	public Element getChild(int index);
	public void print();
	public void accept(Visitor visitor);
	void setNewValue(String newValue);
	Element copy();
	}
