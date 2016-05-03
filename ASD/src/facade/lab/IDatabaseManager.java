package facade.lab;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface IDatabaseManager {
	public Connection getConnection();

	public PreparedStatement getPreparedStatement();

	public CallableStatement getCallableStatement();
	
	public ResultSet getResultSet();
}
