package facade.lab;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface IDatabaseManager {
	public void openConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException;

	

	public CallableStatement getCallableStatement();
	
	public ResultSet getResultSet() throws SQLException;

	PreparedStatement getPreparedStatement(String sql) throws SQLException;
}
