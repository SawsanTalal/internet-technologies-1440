package uqu.jeelab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import uqu.jeelab.model.movieslist;

public class movielistDAO {
	private static String URL = "db4free.net:3306/movieslist";
	private static String user = "sawsannadine";
	private static String password = "12345678";
	private Connection connect = null;
	private ResultSet resultSet = null;
	private ArrayList resList = new ArrayList();

	public ArrayList getMovieslist() throws Exception {
		try {
			connect = DriverManager.getConnection("jdbc:mysql://" + URL, user, password);
			Statement statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from  movieslist");
			while (resultSet.next()) {
				String Name = resultSet.getString("Movie Name");
				String Date = resultSet.getString("Date");
				String Time = resultSet.getString("Time");
				resList.add(new movieslist(Name, Date, Time));
			}
			return resList;
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
