
public class ImageProxy implements Element{
	private String _nume;
	private Image _realImage;
	public ImageProxy(String nume) {
		_nume = nume;
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
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	public String get_nume() {
		return _nume;
	}

	public Image get_realImage() {
		return _realImage;
	}

	public void set_realImage(Image _realImage) {
		this._realImage = _realImage;
	}

	@Override
	public void setNewValue(String newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element copy() {
		// TODO Auto-generated method stub
		return null;
	}



}
