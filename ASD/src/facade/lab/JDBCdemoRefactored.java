package facade.lab;

public class JDBCdemoRefactored {
	public static void main(String[] arg) {
		IDatabaseCommander db = new DatabaseFacadeCommander();
		IDatabaseManager imanager = new DatabaseManager();
		String sql = "SELECT * FROM <table> WHERE <column name> =?";
		db.runSql(sql, imanager);

		sql = "{call <stored procedure>( ?, ? )}";
		db.runStoredProcedure(sql, imanager);
	}

}
