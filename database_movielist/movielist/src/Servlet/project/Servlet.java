package Servlet.project;

import uqu.jeelab.dao.movielistDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEBINF/form.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		movielistDAO movie = new movielistDAO();
		ArrayList result = null;
		try {
			result = movie.getMovieslist();
			request.setAttribute("movieslist", result);
			this.getServletContext().getRequestDispatcher("/WEBINF/list.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
