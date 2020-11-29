package com.coffeepoweredcrew.command;

public class Client {

	public static void main(String[] args) throws InterruptedException {

		EWSService service = new EWSService();
		Command c1 = new AddMemberCommand("xx@yy.com", "spam", service);
		MailTasksRunner.getInstance().addCommand(c1);

		Command c2 = new AddMemberCommand("asdf@qwer.com", "spam", service);
		MailTasksRunner.getInstance().addCommand(c2);

		Thread.sleep(3000);
		MailTasksRunner.getInstance().shutdown();
	}

}
