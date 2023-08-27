package com.nitheesh.core.java8.jdbc.implementation;

import java.sql.SQLException;
import java.util.List;

public class Client {
	
	
	//implementing using java8 and jdbc features...
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
String username="root";
		
		String password="Nitheeshreddy143@";
		
		String uri="jdbc:mysql://localhost:3306/jdbcprac";
		
		JdbcExample jdbcExample=new JdbcExample();
		
		
		jdbcExample.CreateDriver();
		
		jdbcExample.establishConnection(uri, username, password);
			
		//jdbcExample.addDataToDatabase(Assingment.generateListOfCharacters());
		
		List<BookCharacter> characters=jdbcExample.getDataFromBookCharacters();
		
		characters.forEach((c)-> System.out.println(c));
		
		System.out.println(characters.size());
		
		jdbcExample.closeAll();

		
	}

}
