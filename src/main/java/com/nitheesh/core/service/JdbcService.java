package com.nitheesh.core.service;

import java.sql.SQLException;
import java.util.List;

import com.nitheesh.core.entity.BookCharacter;

public interface JdbcService {
	
	
	public void CreateDriver() throws ClassNotFoundException;
	
	
	public void establishConnection(String url,String username,String password) throws SQLException;
	
	public void addDataToDatabase(List<BookCharacter> BookCharacters) throws SQLException;
	
	
	public List<BookCharacter> getDataFromDatabase() throws SQLException;

	
	public void  closeAll() throws SQLException;
}
