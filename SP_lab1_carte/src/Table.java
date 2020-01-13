import java.util.ArrayList;

public class Table implements Element,Observable{
	private String _nume;
	private String _oldNume;
	private ArrayList<Observer> _observerList = new ArrayList<Observer>();

	public Table(String nume) {
		_nume = nume;
	}

	public String getNume() {
		return _nume;
	}

	@Override
	public void print() {
		System.out.println(_nume);
	}

	@Override
	public int add(Element e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element getChild(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
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
			obs.update(_oldNume, _nume);
		}
	}

	@Override
	public void setNewValue(String newValue) {
		_oldNume = _nume;
		_nume = newValue;
		notifyObservers();
	}

	@Override
	public Element copy() {
		// TODO Auto-generated method stub
		return null;
	}
}
