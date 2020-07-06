package com.in28min.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodo extends HttpServlet {

	private TodosImpl TodosImpl = new TodosImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		TodosImpl.deleteTodo(request.getParameter("todo"));
		response.sendRedirect("/todo.do");
	}
}
