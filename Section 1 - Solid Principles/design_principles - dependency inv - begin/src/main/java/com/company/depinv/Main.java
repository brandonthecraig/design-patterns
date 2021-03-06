package com.company.depinv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message");
		MessagePrinter printer = new MessagePrinter();
		try(PrintWriter printWriter = new PrintWriter(new FileWriter("test_msg.txt"))) {
			printer.writeMessage(msg, new JSONFormatter(), printWriter);
		}
	}

}
