import java.util.ArrayList;

public class Paragraph implements Element, Observable{
	private String _txt;
	private String _oldTxt;
	private AlignStrategy _alignStrategy;
	private ArrayList<Observer> _observerList = new ArrayList<Observer>();
	public Paragraph(String txt) {
		_txt = txt;
	}

	public Paragraph(String txt, FirstObserver fo, SecondObserver so) {
		_txt = txt;
		_observerList.add(fo);
		_observerList.add(so);
	}

	public String getText() {
		return _txt;
	}

	@Override
	public void print() {
		if(_alignStrategy!=null)
			_alignStrategy.print(_txt);
		else
			System.out.println(_txt);
	}

	public AlignStrategy getAlignStrategy() {
		return _alignStrategy;
	}

	public void setAlignStrategy(AlignStrategy _alignStrategy) {
		this._alignStrategy = _alignStrategy;
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
			obs.update(_oldTxt, _txt);
		}
	}

	@Override
	public void setNewValue(String newValue) {
		_oldTxt = _txt;
		_txt = newValue;
		notifyObservers();
	}

	@Override
	public Element copy() {
		Paragraph p = new Paragraph(_txt);
		p._oldTxt = _oldTxt;
		p._alignStrategy = null;//new AlignStrategy();	
		String _oldTxt;
		AlignStrategy _alignStrategy;
		ArrayList<Observer> _observerList = new ArrayList<Observer>();
		return null;
	}
}
