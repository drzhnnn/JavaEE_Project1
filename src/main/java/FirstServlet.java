import firstPackage.Cart;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       HttpSession session = request.getSession();

       String name = request.getParameter("name");
       int quantity = Integer.parseInt(request.getParameter("quantity"));

       Cart cart = (Cart) session.getAttribute("cart");
       if (cart == null) {
           cart = new Cart();
           cart.setName(name);
           cart.setQuantity(quantity);
       }

       session.setAttribute("cart", cart);

       getServletContext().getRequestDispatcher("/cartJsp.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
