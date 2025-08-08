package javap;

import java.util.Scanner;

public class ChatBot {
	Scanner s = new Scanner(System.in);

	void chatBotWelcomeMsg() {
		
		while (true) {
			System.out.println("Hello! How can I help you: ");
			String msg = s.nextLine();
			msg = msg.toLowerCase();

			if (msg.equals("hello") || msg.equals("hi")) {
				System.out.println("Hello Ajay...");
			} else if (msg.equals("help")) {
				System.out.println("What help do you want?");
			} else if (msg.equals("what is java")) {
				System.out.println("Java is a programming language.");
			} else if (msg.equals("exit")) {
				System.out.println("Byee...");
				break;

			} else {
				System.out.println("I don't understand your message.");
				break;

			}
		}
	}

	public static void main(String[] args) {
		ChatBot obj = new ChatBot();
		obj.chatBotWelcomeMsg();
		obj.s.close();
	}
}
