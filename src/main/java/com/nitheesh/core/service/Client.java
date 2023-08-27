package com.nitheesh.core.service;

import java.sql.SQLException;
import java.util.List;

import com.nitheesh.core.entity.BookCharacter;

public interface Client {
	
	
	public void createBookseries() throws SQLException;
	
	
	public List<BookCharacter> getBookcharacters() throws SQLException;

}
