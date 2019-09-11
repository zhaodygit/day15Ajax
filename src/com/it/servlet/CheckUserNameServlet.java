package com.it.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.UserDao;
import com.it.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class CheckUserNameServlet
 */
@WebServlet("/CheckUserNameServlet")
public class CheckUserNameServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		System.out.println("name="+ name);
		UserDao dao = new UserDaoImpl();
		try {
			boolean isExist = dao.checkUserName(name);
			if(isExist) {
				response.getWriter().println(1);//存在
			}else {
				response.getWriter().println(0);//不存在
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
