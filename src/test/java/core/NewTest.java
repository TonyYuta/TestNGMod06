package core;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.annotations.Test;

public class NewTest {
	
	Checkstyle checkstyle;
	
	@Test
	public void test() {
		assertThat((2 + 2), equalTo(4));
	}

	@Test (enabled = true)
	public void testHW06() {
		org.testng.Assert.assertEquals("ai17", "ai17", "These Strings don't match");
	}
	
	@Test (enabled = true)
	public void testHW06_02() {
		checkstyle = new Checkstyle();
		org.testng.Assert.assertEquals(checkstyle.sumRes(3, 7), 10, "Wrong sum result");
	}
	
	@Test (enabled = true)
	public void testHW06_03() {
		checkstyle = new Checkstyle();
		org.testng.Assert.assertEquals(checkstyle.sumRes(2, 18), 20, "Wrong sum result");
	}
	
	@Test (enabled = true)
	public void testHW06_04() {
		checkstyle = new Checkstyle();
		org.testng.Assert.assertEquals(checkstyle.sumRes(30, 0), 30, "Wrong sum result");
	}
	
	@Test (enabled = true)
	public void testHW06_05() {
		checkstyle = new Checkstyle();
		org.testng.Assert.assertEquals(checkstyle.sumRes(50, 50), 100, "Wrong sum result");
	}
	
	@Test (enabled = true)
	public void testHW06_06() {
		checkstyle = new Checkstyle();
		org.testng.Assert.assertEquals(checkstyle.sumRes(0, 0), 0, "Wrong sum result");
	}
	
}
