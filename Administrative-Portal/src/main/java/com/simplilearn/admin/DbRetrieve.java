package com.simplilearn.admin;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.security.auth.Subject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.models.Student;
import com.simplilearn.models.Teacher;

@WebServlet("/LearnersServlet")
public class DbRetrieve extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Acdemy1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "PHP#mysql#44";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            
            String sql = "SELECT * FROM students";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // Create an HTML table to display the retrieved data
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Students at Learners Academy</h1>");
            out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Age</th></tr>");
            
            
            while (resultSet.next()) {
                int studentId = resultSet.getInt("id");
                String studentName = resultSet.getString("name");
                int studentAge = resultSet.getInt("age");
                out.println("<tr><td>" + studentId + "</td><td>" + studentName + "</td><td>" + studentAge + "</td></tr>");
            }
            
            out.println("</table>");
            out.println("</body></html>");
            
          
            resultSet.close();
            preparedStatement.close();
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            
        }
    }

	public List<Subject> getSubjects() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<com.simplilearn.models.Class> getClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> loadClassStudents(int classId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return null;
	}
}