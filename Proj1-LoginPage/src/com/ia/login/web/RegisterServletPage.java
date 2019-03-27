package com.ia.login.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ia.login.bean.LoginBean;
import com.ia.login.dao.LoginDAO;
import com.ia.login.dao.RegisterDAO;

@WebServlet("/register")
public class RegisterServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RegisterDAO registerDAO;

	public void init() {
		registerDAO = new RegisterDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setEmail(email);
		loginBean.setUsername(username);
		loginBean.setPassword(password);

		try {
			if (registerDAO.validate(loginBean)) {
				// HttpSession session = request.getSession();
				// session.setAttribute("username",username);
				response.sendRedirect("loginsuccess.jsp");
			} else {
				response.sendRedirect("err.jsp");
				HttpSession session = request.getSession();
				// session.setAttribute("user", username);
				// response.sendRedirect("login.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
