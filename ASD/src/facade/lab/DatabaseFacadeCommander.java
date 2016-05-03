package facade.lab;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseFacadeCommander implements IDatabaseCommander {
	IDatabaseManager imanager;

	public DatabaseFacadeCommander() {
		imanager = new DatabaseManager();

	}

	@Override
	public void runSql(String query, IDatabaseManager dm) {
		// TODO Auto-generated method stub
		try {
			imanager.openConnection();
			imanager.getPreparedStatement(query)
			.setString(1, "<column value>");
			ResultSet rset = imanager.getResultSet();
			if (rset.next()) {
				System.out.println(rset.getString("<column name"));
			}
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void runStoredProcedure(String query, IDatabaseManager dm) {
		// TODO Auto-generated method stub

	}

	public void runSelect() {
		String sql = "SELECT * FROM <table> WHERE <column name> =?";
		runSql(sql,imanager);
	}

}