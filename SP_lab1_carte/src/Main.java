
public class Main {
	public static void main(String[] args) {
		/*
		 * Paragraf paragraf1 = new Paragraf("text paragraf1");
		 * 
		 * Imagine img1 = new Imagine("img1");
		 * 
		 * Tabel tabel1 = new Tabel();
		 * 
		 * Subcapitol subcapitol1 = new Subcapitol("subcap1");
		 * subcapitol1.addParagraf(paragraf1); subcapitol1.addImagine(img1);
		 * subcapitol1.addTabel(tabel1);
		 * 
		 * Capitol capitol1 = new Capitol("capitol 1");
		 * capitol1.addSubcapitol(subcapitol1);
		 * 
		 * Autor autor1 = new Autor("John","Wick");
		 * 
		 * Cuprins cuprins = new Cuprins(); cuprins.set_txt("blalabla");
		 * 
		 * Carte carte1 = new Carte("How to cook shaorma in 5 minutes");
		 * carte1.setCuprins(cuprins); carte1.addAutor(autor1);
		 */

		/*
		 * // Lab1 Carte carte1 = new Carte("carte1"); Autor autor1 = new Autor("John",
		 * "Wick"); carte1.addAutor(autor1); int indexOfChapter =
		 * carte1.createChapter("Chapter1"); Capitol capitol1 =
		 * carte1.getChapter(indexOfChapter);
		 * 
		 * int indexOfSubchapter = capitol1.createSubChapter("subchapter1"); Subcapitol
		 * subcap1 = capitol1.getSubChapter(indexOfSubchapter);
		 * 
		 * int indexOfImagine = subcap1.createImage("img1"); int indexOfParagrapf =
		 * subcap1.createParagraph("paragraph1"); int indexOfTable =
		 * subcap1.createTable("table1");
		 * 
		 * subcap1.print();
		 */

		/*
		 * // Lab2 Carte discoTitanic = new Carte("Disco Titanic"); Autor rpGheo = new
		 * Autor("Radu Pavel Gheo");
		 * 
		 * discoTitanic.addAutor(rpGheo); int indexChapterOne =
		 * discoTitanic.createChapter("Capitolul 1"); Capitol chp1 =
		 * discoTitanic.getChapter(indexChapterOne); int indexSubChapterOneOne =
		 * chp1.createSubChapter("Subcapitolul 1.1"); Subcapitol scOneOne =
		 * chp1.getSubChapter(indexSubChapterOneOne);
		 * 
		 * scOneOne.createNewParagraph("Paragraph 1");
		 * scOneOne.createNewParagraph("Paragraph 2");
		 * scOneOne.createNewParagraph("Paragraph 3");
		 * scOneOne.createNewImage("Image 1");
		 * scOneOne.createNewParagraph("Paragraph 4");
		 * scOneOne.createNewTable("Table 1");
		 * scOneOne.createNewParagraph("Paragraph 5");
		 * 
		 * scOneOne.print();
		 * 
		 */

		/*
		 * // Lab3 Carte noapteBuna = new Carte("Noapte buna, copii"); Autor rpGheo =
		 * new Autor("Radu Pavel Gheo"); noapteBuna.addAutor(rpGheo);
		 * 
		 * Section cap1 = new Section("Capitolul 1"); Section cap11 = new
		 * Section("Capitolul 1.1"); Section cap111 = new Section("Capitolul 1.1.1");
		 * Section cap1111 = new Section("Subchapter 1.1.1.1");
		 * noapteBuna.addContent(new
		 * Paragraf("Multumesc celor care au facut posibila...."));
		 * noapteBuna.addContent(cap1); cap1.add(new Paragraf("Moto capitol"));
		 * cap1.add(cap11); cap11.add(new Paragraf("Text from subchapter 1.1"));
		 * cap11.add(cap111); cap111.add(new Paragraf("Text from subchapter 1.1.1"));
		 * cap111.add(cap1111); cap111.remove(cap1111); cap1111.add(new
		 * Imagine("Image subchapter 1.1.1.1")); noapteBuna.print();
		 */
		// lab4();
//	lab5();
//		lab6();
//		lab7();
//		lab8();
//		lab9();
		lab10();
	}
/*
	private static void lab4() {
		long StartTime = System.currentTimeMillis();
		Image img1 = new Image("Image 1");
		Image img2 = new Image("Image 2");
		Image img3 = new Image("Image 3");

		Section section1 = new Section("Section 1");
		section1.add(img1);

		Section section2 = new Section("Section 2");
		section2.add(img2);
		section2.add(img3);

		Book book1 = new Book("Book 1");
		book1.addContent(section1);
		book1.addContent(section2);
		long EndTime = System.currentTimeMillis();

		System.out.println("Creation of the content took " + (EndTime - StartTime) + " miliseconds");

		StartTime = System.currentTimeMillis();
		section1.print();
		EndTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (EndTime - StartTime) + " miliseconds");

		StartTime = System.currentTimeMillis();
		section1.print();
		EndTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (EndTime - StartTime) + " miliseconds");

		// endregion
	}

	private static void lab5() {
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");

		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new AlignCenter());
		p2.setAlignStrategy(new AlignRight());
		p3.setAlignStrategy(new AlignLeft());
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();
	}

	private static void lab6() {
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		FinancialStatus fstats = new FinancialStatus();
		cap1.accept(stats);
		cap1.accept(fstats);
		stats.printStatistics();
		System.out.println();
		fstats.printStatistics();
	}

	private static void lab7() {
		Builder jsonBuilder = new JSONBuilder();
		jsonBuilder.Build();
		Element myBook = jsonBuilder.GetResult();
		myBook.print();
	}
	
	private static void lab8() {
		Command cmd1 = new OpenCommand("C:\\Users\\casi-laptop\\eclipse-workspace_new\\SP_lab1_carte\\src\\book.json");
		cmd1.execute();
		Command cmd2 = new StatisticsCommand();
		cmd2.execute();
        DocumentManager.getInstance().getBook().print();
	}
	*/
	private static void lab9() {
		new FirstObserver();
		new SecondObserver();
		
		Section cap1 = new Section("Capitolul 1", FirstObserver.getInstance(), SecondObserver.getInstance());
		Paragraph p1 = new Paragraph("Paragraph 1", FirstObserver.getInstance(), SecondObserver.getInstance());
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2", FirstObserver.getInstance(), SecondObserver.getInstance());
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));


		cap1.setNewValue("CHAPTER 1");
		p1.setNewValue("PARAGRAPH 2");
		p2.setNewValue("PARAGRAPH 3");
		cap1.removeObserver(FirstObserver.getInstance());
		cap1.setNewValue("CHAPTER 1.1");
	}
	
	private static void lab10() {
		Book book = new Book("carte1");
		Section cap1 = new Section("Capitolul 1");
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(new Paragraph("Another One"));
		cap1.add(new Paragraph("Another Two"));
		cap1.add(new Paragraph("Another Three"));
		book.addContent(cap1);
		DocumentManager.getInstance().setBook(book);
		System.out.println("Book Content: ");
		DocumentManager.getInstance().getBook().print();

		new DeleteCommand().execute();
		DocumentManager.getInstance().getBook().print();

		System.out.println("Book Content after the first delete: ");
		DocumentManager.getInstance().getBook().print();
		new DeleteCommand().execute();
		System.out.println("Book Content after the second delete: ");
		DocumentManager.getInstance().getBook().print();

		Command undoCommand = new UndoCommand();
		undoCommand.execute();
		System.out.println("Book Content after first undo: ");
		DocumentManager.getInstance().getBook().print();
		undoCommand.execute();
		System.out.println("Book Content after second undo: ");
		DocumentManager.getInstance().getBook().print();
	}
}