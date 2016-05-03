package facade.lab;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager implements IDatabaseManager {

	Connection conn = null;
	PreparedStatement prep = null;
	CallableStatement call = null;
	ResultSet rset = null;
	
	@Override
	public void openConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("<driver>").newInstance();
		 conn = DriverManager.getConnection("<database>");
	}

	@Override
	public PreparedStatement getPreparedStatement(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return prep = conn.prepareStatement(sql);
	}

	@Override
	public CallableStatement getCallableStatement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet getResultSet() throws SQLException {
		// TODO Auto-generated method stub
		return rset = prep.executeQuery();
	}

}
