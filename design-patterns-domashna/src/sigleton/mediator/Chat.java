package sigleton.mediator;
import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	public List<User> users;

	private Singleton singleton;
	// private Singleton singleton = new Singleton();

	public Chat() {
		// TODO Auto-generated constructor stub
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.users.add(user);

	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub

		this.users.remove(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		// TODO Auto-generated method stub

		for (User chatUser : this.users) {

			if (user != chatUser) {
				chatUser.recieve(message);
			}
		}

		if (Singleton.checkWords(message, user)) {
			removeUser(user);
		}

	}

}
