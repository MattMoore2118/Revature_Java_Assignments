package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
	//System.out.println("Hello World with Maven");
		Connection connection=null;
		try {
		//Step 1 - Load Driver
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded Successfully");
		//Step 2 - Open Connection (url,username,password)
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "Ynwa3713640";
		connection=DriverManager.getConnection(url, username, password);
		System.out.println("Connection Success");
		//Step 3 - Create Statement
		Statement statement = connection.createStatement();
		String sql = "select id,player_name,team_id,goals,dob,earnings from \"Test\".player order by id desc";
		//Step 4 - Execute Query
		ResultSet resultSet=statement.executeQuery(sql);
		System.out.println("Query Executed");
		//Step 5 - Process Results
		while(resultSet.next()) {
			System.out.print("ID:"+ resultSet.getInt("id"));
			System.out.print(" Name:"+resultSet.getString("player_name"));
			System.out.print(" Team ID:"+resultSet.getInt("team_id"));
			System.out.print(" Goals:"+ resultSet.getInt("goals"));
			System.out.print(" Date of Birth:"+resultSet.getDate("dob"));
			System.out.println(" Estimated Earnings in 2020:"+resultSet.getLong("earnings"));
		}
		System.out.println("Results Processed");
	}catch (ClassNotFoundException e) {
		System.out.println(e);
	}catch (SQLException e) {
		System.out.println(e);
	}finally { //Step 6 - Closing Connection
		try {
			connection.close();
			System.out.println("Connection closed");
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	}

}
