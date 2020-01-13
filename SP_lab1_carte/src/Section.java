import java.util.ArrayList;
import java.util.LinkedList;

public class Section implements Element,Observable{
	private LinkedList<Element> _content = new LinkedList<Element>();
	private String _section_title;
	
	public Section(String section_title, FirstObserver fo, SecondObserver so) 
	{
		_section_title = section_title;
		_observerList.add(fo);
		_observerList.add(so);
	}
	public Section(String section_title) {
		_section_title = section_title;
	}
	
	private String _oldSectionTitle;
	private ArrayList<Observer> _observerList = new ArrayList<Observer>();

	public int add(Element e) {
		_content.add(e);
		return _content.indexOf(e);
	}
	
	public void remove(Element e) {
		_content.remove(e);
	}
	
	public Element getElement(int index) {
		return _content.get(index);
	}
	
	public String get_section_title() {
		return _section_title;
	}

	@Override
	public void print() {
		System.out.println(_section_title);
		for (Element e : _content) {
			e.print();
		}
	}

	@Override
	public Element getChild(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(Visitor visitor) {
		for (Element e : _content) {
			e.accept(visitor);
		}
	}

	@Override
	public void setNewValue(String newValue) {
		_oldSectionTitle = _section_title;
		_section_title = newValue;
		notifyObservers();
		}

	public void addObserver(Observer obs) {
		_observerList.add(obs);				
	}

	@Override
	public void removeObserver(Observer obs) {
		_observerList.remove(obs);		
	}

	@Override
	public void notifyObservers() {
		for (Observer obs : _observerList) {
			obs.update(_oldSectionTitle, _section_title);
		}
	}
	public Element getLastElement() {
		return _content.getLast();
	}
	public void removeLastElement() {
		_content.removeLast();
	}
	@Override
	public Element copy() {
		// TODO Auto-generated method stub
		return null;
	}
}
