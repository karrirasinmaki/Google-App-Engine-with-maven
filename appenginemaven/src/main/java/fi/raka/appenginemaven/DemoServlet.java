package fi.raka.appenginemaven;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {

      resp.getWriter().println("Hello Maven!");
      resp.getWriter().println("Hello Maven!");
  }
}
