package observer.pattern;

public interface Observable {

	void buyBook(Observer observer);

	void sellBook(Observer observer);

	void notifyObservers();

	String getUpdate();

}
