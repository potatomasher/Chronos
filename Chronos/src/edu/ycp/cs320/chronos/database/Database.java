package edu.ycp.cs320.chronos.database;

public class Database {
	private static final IDatabase instance = new FakeDatabase();
	
	public static IDatabase getDatabase() {
		return instance;
	}
}
