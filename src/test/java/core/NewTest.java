package core;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void test() {
		assertThat((2 + 2), equalTo(4));
	}

	@Test (enabled = true)
	public void testHW06() {
		org.testng.Assert.assertEquals("ai17", "ai17", "These Strings don't match");
	}
	
}
