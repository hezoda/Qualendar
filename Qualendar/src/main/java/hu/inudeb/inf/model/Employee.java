package hu.inudeb.inf.model;

public class Employee {
	
	private static String name;
	
	private static String schedule;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Employee.name = name;
	}

	public static String getSchedule() {
		return schedule;
	}

	public static void setSchedule(String schedule) {
		Employee.schedule = schedule;
	}
	
	public static boolean requestFreedom() {
		//TO-DO
		return false;
	}

	public static boolean sickPay() {
		//TO-DO
		return true;
	}
}
