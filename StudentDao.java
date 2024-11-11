package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	private static final String URL = "jdbc:mysql://localhost:3307/advjava193"; // Adjust URL if needed
	private static final String USER = "root"; // Replace with your DB username
	private static final String PASSWORD = "root"; // Replace with your DB password

	// Method to establish connection
	private Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC Driver
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	// Method to fetch all student records
	public void getAllStudents1() {
		String query = "SELECT roll_no, name, marks FROM students"; // Query to get students' data
		try (Connection connection = getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(query)) {

			while (resultSet.next()) {
				int rollNo = resultSet.getInt("roll_no");
				String name = resultSet.getString("name");
				int marks = resultSet.getInt("marks");

				System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
