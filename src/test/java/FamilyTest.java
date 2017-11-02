import static org.junit.Assert.*;

import org.junit.Test;

import pl.naczilku.model.Family;

public class FamilyTest {

	private Family rodzina;

	@Test
	public void testFamilyStatus() {
		rodzina = new Family();
		int[] status = { 0, 0, 0 };
		rodzina.setFamilyStatus(status);
		assertArrayEquals(status, rodzina.getFamilyStatus());

	}

}
