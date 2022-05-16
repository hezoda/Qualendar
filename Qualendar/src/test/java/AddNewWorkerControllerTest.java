import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import inf.unideb.hu.controller.AddNewWorkerController;

public class AddNewWorkerControllerTest {
	
	@Test
	void validateEmail() {
		assertEquals(false, AddNewWorkerController.isEmailValid("123344"));
		assertEquals(false, AddNewWorkerController.isEmailValid("rrrr@rrrr"));
		assertEquals(true, AddNewWorkerController.isEmailValid("aaaa@123.hu"));
	}

}
