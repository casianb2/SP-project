
public class DeleteCommand implements Command{
	private Memento _memento = new Memento();
	
	@Override
	public void execute() {
		_memento.setState(((Section) DocumentManager.getInstance().
				getBook().getContent().getLast()).copy());
		((Section) DocumentManager.getInstance().
				getBook().getContent().getLast()).removeLastElement();
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
