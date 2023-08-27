package com.nitheesh.core.java8.jdbc.implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
	
	private Connection connection;
	
	private PreparedStatement statement;
	
	
	
	
	public  void CreateDriver() throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("d ok");
		
	}
	
	public  void establishConnection(String url,String username,String password) throws SQLException {
		
		 this.connection=DriverManager.getConnection(url,username,password);
		 
		 this.statement=connection.prepareStatement("insert into bookseries values(?,?,?,?,?)");
		 
		 System.out.println("c,s ok");
	}
	
	
	
	public  void addDataToDatabase(List<BookCharacter> characters) throws SQLException {
		
		
		System.out.println(characters);
		
		
		for(BookCharacter character:characters) {
			
			statement.setString(1, character.getName());
			statement.setString(2, character.getHouse());
			statement.setString(3, character.getStatus());
			statement.setString(4, character.getRole());
			statement.setString(5, character.getDies());
			
			statement.executeUpdate();

		}	
		
	}
	
	
	public List<BookCharacter> getDataFromBookCharacters() throws SQLException{
		
		ResultSet executeQuery = statement.executeQuery("select * from bookseries");
		
		executeQuery.next();
		
		List<BookCharacter> characters=new ArrayList<>();
		
		while(executeQuery.next()) {
			
			characters.add(new BookCharacter(executeQuery.getString(1),executeQuery.getString(2),executeQuery.getString(3),executeQuery.getString(4),executeQuery.getString(5)));
		}
		
		return characters;
	}
	
	
	
	
	public void closeAll() throws SQLException {
		statement.close();
		connection.close();
	}
	
	
	
}
