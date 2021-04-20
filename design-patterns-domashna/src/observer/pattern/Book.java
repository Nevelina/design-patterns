package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Book implements Observable {

	private List<Observer> client;
	private String book;

	public Book() {
		// TODO Auto-generated constructor stub
		this.client = new ArrayList<>();
	}

	@Override
	public void buyBook(Observer observer) {
		// TODO Auto-generated method stub
		this.client.add(observer);
		observer.setBook(this);

	}

	@Override
	public void sellBook(Observer observer) {
		// TODO Auto-generated method stub
		this.client.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : this.client) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		// TODO Auto-generated method stub
		return this.book;
	}

	public void setBook(String book) {
		this.book = book;
		this.notifyObservers();
	}

}
