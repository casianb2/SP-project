public class OpenCommand implements Command {
    private String _pathToJSON;

    public OpenCommand(String path){
        this._pathToJSON = path;
    }

    @Override
    public void execute() {
        JSONBuilder builder = new JSONBuilder();
        builder.Build();
        Book newBook = new Book("book 1");
        newBook.addContent(builder.GetResult());
        DocumentManager.getInstance().setBook(newBook);
        newBook.print();
    }

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
}