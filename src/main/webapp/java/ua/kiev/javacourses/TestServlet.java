package ua.kiev.javacourses;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: dmitry
 * Date: 14.12.13
 * Time: 22:45
 * To change this template use File | Settings | File Templates.
 */
public class TestServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
    httpServletResponse.getWriter().print("hello");
  }
}
