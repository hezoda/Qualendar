package inf.unideb.hu.model;

import java.time.LocalDate;

public class SickPay {
	
	
	private LocalDate start;
	
	private LocalDate end;

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getEnd() {
		return end;
	}

	public void setEnd(LocalDate end) {
		this.end = end;
	}
	
}
