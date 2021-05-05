package sigleton.mediator;

public class Singleton {

	private static Singleton instance;
	private String message;
	private static int count = 0;
	private static Chat chat;

	private Singleton() {
		// TODO Auto-generated constructor stub

	}

	public static Singleton getInstance() {

		if (instance == null) {
			instance = new Singleton();

		}

		return instance;
	}

	public static boolean checkWords(String message, User user) {
		// TODO Auto-generated method stub

		if (instance == null) {
			return false;
		}

		if (message.contains("cat")) {

			
			System.out.println(user.name + " removed from chat by the bot, Reason: Word cat is in banlist");
			System.out.println();
			return true;
		}

		return false;

	}

}
