package com.coffeepoweredcrew.chainofresponsibility;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.function.Predicate;

public class Client {

	public static void main(String[] args) {

		LeaveApplication application = LeaveApplication.getBuilder()
				.withType(LeaveApplication.Type.Sick)
				.from(LocalDate.now())
				.to(LocalDate.now().plusDays(3L)).build();

		System.out.println(application);

		LeaveApprover approverChain = createChain();
		approverChain.processLeaveApplication(application);
		System.out.println(application.getStatus());
		System.out.println(application.getProcessedBy());

	   
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead projectLead = new ProjectLead(manager);
		return projectLead;
	}
	
}
