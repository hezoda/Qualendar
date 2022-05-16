package inf.unideb.hu.model;

import java.util.List;

public interface FreedomDAO {
	
	public void sendFreedom(Freedom fr);
	
	public void answearFreedom(Freedom fr);
	
	public List<Freedom> getFreedoms(Freedom fr);
}
