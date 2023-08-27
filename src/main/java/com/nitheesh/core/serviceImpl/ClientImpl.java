package com.nitheesh.core.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nitheesh.core.entity.BookCharacter;
import com.nitheesh.core.service.BookCharacterService;
import com.nitheesh.core.service.Client;
import com.nitheesh.core.service.JdbcService;

@Component
public class ClientImpl implements Client{
	
	@Autowired
   private BookCharacterService bookCharacterService;
	
	@Autowired
	private JdbcService jdbcService;

	@Override
	public void createBookseries() throws SQLException {
		jdbcService.addDataToDatabase(bookCharacterService.generateListOfCharacters());
		
	}

	@Override
	public List<BookCharacter> getBookcharacters() throws SQLException {
		
		return jdbcService.getDataFromDatabase();
	}
	
	
}
