package com.coffeepoweredcrew.decorator;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		HtmlEncodedMessage mtml = new HtmlEncodedMessage(m);
		System.out.println(mtml.getContent());

		Base64EncodedMessage base64EncodedMessage = new Base64EncodedMessage(m);
		System.out.println(base64EncodedMessage.getContent());

		Base64EncodedMessage base64EncodedMessage2 = new Base64EncodedMessage(mtml);
		System.out.println(base64EncodedMessage2.getContent());

	}
}
