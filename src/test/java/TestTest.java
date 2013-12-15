import org.junit.Test;
import ua.kiev.javacourses.servlets.TestServlet;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestTest {

  /**
   * This method tests assertTrue
   */
  @Test
  public void testTest1(){
    assertTrue(true);
  }

  /**
   * This method tests access to the java packages and classes
   */
  @Test
  public void testTest2(){
    TestServlet ts = new TestServlet();
    assertTrue(ts.servletHelperMethod());
    assertNotNull(ts);
  }

}
