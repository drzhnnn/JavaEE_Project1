package firstPackage;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("id", "0");
        //Cookie cookie2 = new Cookie("name", "0");

        cookie1.setMaxAge(0);
        //cookie2.setMaxAge(0);

        response.addCookie(cookie1);
        //response.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
