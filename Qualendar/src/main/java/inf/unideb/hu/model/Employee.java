package inf.unideb.hu.model;



public class Employee {

    private int id;
	private static String name;
	private static String schedule;
	private static PositionType position;
	
	public enum PositionType{
		Marketing, Konyvelo, EmberiEroforrasok,Kutato 
	}

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

	public static PositionType getPosition() {
		return position;
	}

	public static void setPosition(PositionType position) {
		Employee.position = position;
	}
}
