package inf.unideb.hu.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private static String name;
	private static String schedule;
	
	@Enumerated(EnumType.STRING)
	private static PositionType position;
	
	public enum PositionType{
		Marketing, Konyvelo, EmberiEroforrasok,Kutato,NULL
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Employee.name = name;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		Employee.schedule = schedule;
	}
	
	public boolean requestFreedom() {
		//TO-DO
		return false;
	}

	public boolean sickPay() {
		//TO-DO
		return true;
	}

	public PositionType getPosition() {
		return position;
	}

	public void setPosition(PositionType position) {
		Employee.position = position;
	}
}
