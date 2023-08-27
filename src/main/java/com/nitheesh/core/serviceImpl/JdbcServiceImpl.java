package com.nitheesh.core.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nitheesh.core.entity.BookCharacter;
import com.nitheesh.core.service.JdbcService;

@Component
public class JdbcServiceImpl implements JdbcService {
	
	
	
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
	
	
	
	
	
	
	

	@Override
	public void addDataToDatabase(List<BookCharacter> BookCharacters) throws SQLException {
System.out.println(BookCharacters);
		
		
		for(BookCharacter character:BookCharacters) {
			
			statement.setString(1, character.getName());
			statement.setString(2, character.getHouse());
			statement.setString(3, character.getStatus());
			statement.setString(4, character.getRole());
			statement.setString(5, character.getDies());
			
			statement.executeUpdate();

		}	
		
	}

		
	

	@Override
	public List<BookCharacter> getDataFromDatabase() throws SQLException {
		
			
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
