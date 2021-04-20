package observer.pattern;

public class ObserverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book part = new Book();

		Observer obs1 = new BookClient("Client Maria");
		Observer obs2 = new BookClient("Client Veni");
		Observer obs3 = new BookClient("Client Kris");

		part.buyBook(obs1);
		part.buyBook(obs2);
		part.buyBook(obs3);

		part.setBook(" Hamlet ");
		part.setBook(" Sherlock Homes ");
	}

}
