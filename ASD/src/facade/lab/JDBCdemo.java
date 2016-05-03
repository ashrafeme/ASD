package facade.lab;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCdemo {
	public static void main(String[] arg) {
		Connection conn = null;
		PreparedStatement prep = null;
		CallableStatement call = null;
		ResultSet rset = null;
		try {
			Class.forName("<driver>").newInstance();
			conn = DriverManager.getConnection("<database>");
			String sql = "SELECT * FROM <table> WHERE <column name> =?";
			prep = conn.prepareStatement(sql);
			prep.setString(1, "<column value>");
			rset = prep.executeQuery();
			if (rset.next()) {
				System.out.println(rset.getString("<column name"));
			}
			sql = "{call <stored procedure>( ?, ? )}";
			call = conn.prepareCall(sql);
			call.setInt(1, 1972);
			call.registerOutParameter(2, java.sql.Types.INTEGER);
			call.execute();
			System.out.println(call.getInt(2));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (prep != null) {
				try {
					prep.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (call != null) {
				try {
					call.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
