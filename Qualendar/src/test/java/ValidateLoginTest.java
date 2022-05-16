import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import inf.unideb.hu.ValidateLogin;

public class ValidateLoginTest {
	
	@Test
	void bossLoginFail() {
		assertEquals(false, ValidateLogin.bossLoginValidate("Admin", "Admin"));
		assertEquals(true, ValidateLogin.bossLoginValidate("admin", "admin"));

	}
	
	@Test
	void workerLoginFail() {
		assertEquals(false, ValidateLogin.workerLoginValidate("NagPet", "rosszjelszo"));
	}
}
