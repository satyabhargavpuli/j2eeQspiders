package com.in28min.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {

	//private LoginService service = new LoginService();
	private TodosImpl Toimpl = new TodosImpl();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		
		request.setAttribute("todoL", Toimpl.retrieveTodos());
		request.getRequestDispatcher("WEB-INF/views/todo.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String addToDolist = request.getParameter("todoAdd");
		System.out.println(addToDolist);
		Toimpl.addListData(new Todos(addToDolist));
		response.sendRedirect("/todo.do	");
		
		/*
		 * request.setAttribute("todoL", Toimpl.retrieveTodos());
		 * request.getRequestDispatcher("WEB-INF/views/todo.jsp").forward(request,
		 * response);
		 */
	}

	


}