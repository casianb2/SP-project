
public class StatisticsCommand implements Command {
	@Override
	    public void execute() {
	        BookStatistics statistics = new BookStatistics();

	        Book newBook = DocumentManager.getInstance().getBook();

	        DocumentManager.getInstance().getBook().accept(statistics);
	    }

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
	}