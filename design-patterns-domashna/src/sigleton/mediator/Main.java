package sigleton.mediator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MessageMediator chat = new Chat();

		User user1 = new ChatUser(chat, "Kris");
		User user2 = new ChatUser(chat, "Pesho");
		User user3 = new ChatUser(chat, "Tosho");

		user2.send("cat is my favorite animal");
		user1.send("i am joining addBot");
		user2.send("i said cat");

		user3.send("you deserve this");
		user1.send("hehehe");

		
	}

}
