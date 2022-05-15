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
    private long id;
	private String name;
	private String email;
	private String schedule;
	
	@Enumerated(EnumType.STRING)
	private PositionType position;
	
	public enum PositionType{
		Marketing, Konyvelo, EmberiEroforrasok,Kutato,NULL
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
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
		this.position = position;
	}
}
