package facade.lab;

public interface IDatabaseCommander {

	public void runSql(String query,IDatabaseManager dm);
	public void runStoredProcedure(String query,IDatabaseManager dm);
}
