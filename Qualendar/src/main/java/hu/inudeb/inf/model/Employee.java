package hu.inudeb.inf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
    @GeneratedValue
    private int id;
	private static String name;
	private static String schedule;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
