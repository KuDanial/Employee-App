package person.controller;
import java.io.IOException;
import java.sql.*;
import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import person.bean.Staff;

@WebServlet(name = "ViewEmpController", urlPatterns = {"/ViewEmpController"})
public class ViewEmpController extends HttpServlet {
    // PASSWORD UPDATE REQUIRED HERE
    private String dbURL = "jdbc:mysql://localhost:3306/emp";
    private String dbUser = "root";
    private String dbPassword = "admin"; // <--- CHECK THIS
    private String dbDriver = "com.mysql.cj.jdbc.Driver";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Staff> list = new ArrayList<>();
        try {
            Class.forName(dbDriver);
            Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM staff");
            
            while(rs.next()) {
                Staff s = new Staff();
                s.setId(rs.getInt("ID"));
                s.setName(rs.getString("NAME"));
                s.setSalary(rs.getDouble("SALARY"));
                s.setDesignation(rs.getString("DESIGNATION"));
                list.add(s);
            }
            request.setAttribute("staffList", list);
            request.getRequestDispatcher("viewEmp.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("debugError", e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}