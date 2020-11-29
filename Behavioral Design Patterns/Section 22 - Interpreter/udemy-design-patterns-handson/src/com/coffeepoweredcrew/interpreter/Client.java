package com.coffeepoweredcrew.interpreter;

public class Client {

	public static void main(String[] args) {

		Report report1 = new Report("Cashflow report", "ADMIN");
		ExpressionBuilder builder = new ExpressionBuilder();
		PermissionExpression expression = builder.build(report1);
		System.out.println(expression);

		User user1 = new User("Jack", "USER", "ADMIN");
		System.out.println("User Access Report:" + expression.interpret(user1));
		
	}

}
