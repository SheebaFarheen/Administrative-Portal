package com.simplilearn.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.simplilearn.models.Student;
import com.simplilearn.models.Teacher;
import com.simplilearn.models.Class;

/**
 * Servlet implementation class AdminControllerServlet
 */
@WebServlet("/AdminControllerServlet")
public class AdminControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DbRetrieve dbRetrieve;

	@Resource(name = "jdbc_database")
	private DataSource datasource;

	private PrintWriter ps;

	public void init() throws ServletException {

		super.init();

		
		try {
			dbRetrieve = new DbRetrieve();

		} catch (Exception e) {
			throw new ServletException(e);
		}

	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String username=req.getParameter("username");
		String password=req.getParameter("password");
		System.out.println(username+ " " +password);
		ps = resp.getWriter();
		ps.print("username=" + username);
		ps.print("password=" + password);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			
			String command = request.getParameter("command");

			if (command == null) {
				command = "CLASSES";
			}
			
			

			else {

				// if there is no command, how to handle

				// route the data to the appropriate method
				switch (command) {

				case "STUDENTS":
					studentsList(request, response);
					break;

				case "TEACHERS":
					teachersList(request, response);
					break;

				case "SUBJECTS":
					subjectList(request, response);
					break;

				case "CLASSES":
					classestList(request, response);
					break;

				case "ST_LIST":
					classStudentsList(request, response);
					break;

				case "LOGIN":
					log(request, response);
					break;

				default:
					classestList(request, response);

				}
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
	}

	private void log(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void studentsList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Student> students = dbRetrieve.getStudents();

		
		request.setAttribute("STUDENT_LIST", students);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
		dispatcher.forward(request, response);

	}

	private void teachersList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Teacher> teachers = dbRetrieve.getTeachers();

		
		request.setAttribute("TEACHERS_LIST", teachers);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teachers-list.jsp");
		dispatcher.forward(request, response);

	}

	private void subjectList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<javax.security.auth.Subject> subjects = dbRetrieve.getSubjects();

		
		request.setAttribute("SUBJECTS_LIST", subjects);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/subjects-list.jsp");
		dispatcher.forward(request, response);

	}

	private void classestList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Class> classes = dbRetrieve.getClasses();

		
		request.setAttribute("CLASSES_LIST", classes);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/classes-list.jsp");
		dispatcher.forward(request, response);

	}

	

	private void classStudentsList(HttpServletRequest request, HttpServletResponse response) throws Exception {

		int classId = Integer.parseInt(request.getParameter("classId"));
		String section = request.getParameter("section");
		String subject = request.getParameter("subject");

		// get subjects from db util
		List<Student> students = dbRetrieve.loadClassStudents(classId);

		// add subjects to the request
		request.setAttribute("STUDENTS_LIST", students);
		request.setAttribute("SECTION", section);
		request.setAttribute("SUBJECT", subject);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/class-students.jsp");
		dispatcher.forward(request, response);
	}
	

	    protected void doGet1(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        
	        Cookie usernameCookie = new Cookie("username", "admin");
	        Cookie roleCookie = new Cookie("role", "admin");

	        
	        usernameCookie.setMaxAge(24 * 60 * 60); // 24 hours in seconds
	        roleCookie.setMaxAge(24 * 60 * 60); // 24 hours in seconds

	        
	        response.addCookie(usernameCookie);
	        response.addCookie(roleCookie);

	        
	        response.sendRedirect("admin_dashboard.jsp"); 
	

		
		
		

	}

}
