package com.coffeepoweredcrew.adapter;

public class Main {

	public static void main(String[] args) {
		BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();

		/** Using Class/Two-way adapter **/
		EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
		populateEmployeeData(classAdapter);
		String card = businessCardDesigner.designCard(classAdapter);
		System.out.println(card);
		System.out.println("--------");
		
		
		/** Using Object Adapter **/
		Employee employee = new Employee();
		populateEmployeeData(employee);

		EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
		String card2 = businessCardDesigner.designCard(employeeObjectAdapter);
		System.out.println(card2);

	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
