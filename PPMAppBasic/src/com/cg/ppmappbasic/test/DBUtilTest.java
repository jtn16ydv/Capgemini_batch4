package com.cg.ppmappbasic.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.ppmappbasic.util.DBUtil;

public class DBUtilTest {

	public static void main(String[] args) {
		DBUtil dbUtil =  new DBUtil();
		String sql = "Insert into projects(name, description, pid) values (?,?,?)";
		PreparedStatement pstmt =  dbUtil.prepareStatement(sql);
		try {
			pstmt.setString(1, "Project2");
			pstmt.setString(2, "Project 2 description");
			pstmt.setString(3, "fp02");
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dbUtil.closePrepareStatement();

	}

}
