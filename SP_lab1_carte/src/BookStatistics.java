
public class BookStatistics implements Visitor{
	public int _imageNr = 0;
	public int _imageProxyNr = 0;
	public int _paragraphNr = 0;
	public int _tableNr = 0;
	public int _sectionNr = 0;
	
	public int _imgPrice = 5;
	public int _imgProxyPrice = 4;
	public int _paragraphPrice = 10;
	public int _tablePrice = 6;
	
	@Override
	public void visit(Image image) {
		_imageNr++;
	}

	@Override
	public void visit(ImageProxy imageProxy) {
		_imageProxyNr++;
	}

	@Override
	public void visit(Paragraph paragraph) {
		_paragraphNr++;
	}

	@Override
	public void visit(Table table) {
		_tableNr++;
	}
	
	@Override
	public void visit(Section section) {
		_sectionNr++;
	}
	public void printStatistics() {	
		System.out.println(
				"No. of sections: " + _sectionNr + '\n' +
				"No. of images: " + _imageNr + '\n' +
				"No. of imageProxies: " + _imageProxyNr + '\n' +
				"No. of paragraphs: " + _paragraphNr + '\n' +
				"No. of tables: " + _tableNr);
	}
	
}
