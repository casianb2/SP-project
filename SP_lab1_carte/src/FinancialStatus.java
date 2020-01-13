
public class FinancialStatus extends BookStatistics {
	public void printStatistics() {
		System.out.println("No. of images: " + _imageNr + ". \tTotal price: " + _imgPrice * _imageNr + "$\n"
				+ "No. of imageProxies: " + _imageProxyNr + ". Total price: " + _imgProxyPrice * _imageProxyNr + "$\n"
				+ "No. of paragraphs: " + _paragraphNr + ".   Total price: " + _paragraphPrice * _paragraphNr + "$\n"
				+ "No. of tables: " + _tableNr + ". \tTotal price: " + _tablePrice * _tableNr + "$");
	}
}
