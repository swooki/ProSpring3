package us.thekwons.prospring3.ch2;

import junit.framework.TestCase;
import us.thekwons.prospring3.ch2.ExampleService;

public class ExampleServiceTests extends TestCase {

	private ExampleService service = new ExampleService();
	
	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", service.getMessage());
	}

}
