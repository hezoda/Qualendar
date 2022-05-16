package inf.unideb.hu.model;

import java.util.List;

public interface SickPayDAO {

	public void SendSickPay(SickPay sp);
	public void answearSickPay(SickPay sp);
	public List<SickPay> getSickPay(SickPay sp);
}
