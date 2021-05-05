package sigleton.mediator;

public class ChatUser extends User {

	private Singleton singleton;
	public boolean botOn = false; // can be added only 1 bot in chat

	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub

		System.out.println(this.name + " sends: " + message);

		if (message.contains("addBot") && botOn == false) {

			Singleton.getInstance();
			System.out.println("The bot joined the chat ");
			System.out.println();

			botOn = true;

		}

		mediator.sendMessage(message, this);

	}

	@Override
	public void recieve(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.name + " recieve: " + message);
	}

}
