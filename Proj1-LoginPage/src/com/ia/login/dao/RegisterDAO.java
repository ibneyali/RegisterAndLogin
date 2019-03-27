package com.ia.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ia.login.bean.LoginBean;

public class RegisterDAO {
	public boolean validate(LoginBean loginBean) throws ClassNotFoundException {
		boolean status = false;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "alibaba");
			String query = "insert into login values(?,?,?)";
			pst = con.prepareStatement(query);
			pst.setString(1, loginBean.getEmail());
			pst.setString(2, loginBean.getUsername());
			pst.setString(3, loginBean.getPassword());
			rs = pst.executeQuery();
			status = rs.next();
		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}
		return status;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
