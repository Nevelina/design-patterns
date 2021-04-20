package observer.pattern;

public class BookClient implements Observer {

	public String name;
	private Observable buyedBook;

	public BookClient(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		if (this.buyedBook == null) {
			System.out.println(this.getName() + " has no purcheses");
			return;
		}

		String newBook = this.buyedBook.getUpdate();
		System.out.println(this.getName() + " bought book: " + newBook);

	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public void setBook(Observable book) {
		// TODO Auto-generated method stub
		this.buyedBook = book;
	}

}
