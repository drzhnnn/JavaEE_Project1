package firstPackage;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class LibraryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        PrintWriter pw = response.getWriter();

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_ee_db",
                    "postgres", "041268");

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT title FROM books");

            while(rs.next()) {
                pw.println(rs.getString("title"));
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
