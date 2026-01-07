package person.controller;
import java.io.IOException;
import java.sql.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(name = "EmpController", urlPatterns = {"/EmpController"})
public class EmpController extends HttpServlet {
    // PASSWORD UPDATE REQUIRED HERE
    private String dbURL = "jdbc:mysql://localhost:3306/emp";
    private String dbUser = "root";
    private String dbPassword = "admin"; 
    private String dbDriver = "com.mysql.cj.jdbc.Driver";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String name = request.getParameter("name");
        String desig = request.getParameter("designation");
        double salary = Double.parseDouble(request.getParameter("salary"));
        
        try {
            Class.forName(dbDriver);
            Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            
            if ("add".equals(action)) {
                PreparedStatement pst = conn.prepareStatement("INSERT INTO staff(NAME, SALARY, DESIGNATION) VALUES(?,?,?)");
                pst.setString(1, name); pst.setDouble(2, salary); pst.setString(3, desig);
                pst.executeUpdate();
            } else if ("edit".equals(action)) {
                int id = Integer.parseInt(request.getParameter("id"));
                PreparedStatement pst = conn.prepareStatement("UPDATE staff SET NAME=?, SALARY=?, DESIGNATION=? WHERE ID=?");
                pst.setString(1, name); pst.setDouble(2, salary); pst.setString(3, desig); pst.setInt(4, id);
                pst.executeUpdate();
            }
            response.sendRedirect("success.jsp");
        } catch (Exception e) {
            request.setAttribute("debugError", e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}