package sigleton.mediator;

public abstract class User {

	protected MessageMediator mediator;
	protected String name;

	public User(MessageMediator mediator, String name) {
		// TODO Auto-generated constructor stub
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String message);

	public abstract void recieve(String message);
}
