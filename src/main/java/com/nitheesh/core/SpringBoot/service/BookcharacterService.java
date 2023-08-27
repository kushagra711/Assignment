package com.nitheesh.core.SpringBoot.service;

import java.util.List;
import java.util.Map;

import com.nitheesh.core.SpringBoot.entity.BookCharacter;



public interface BookcharacterService {
	
	
	public List<BookCharacter> getAllCharacters();
	
	
	public BookCharacter createBookCharacter(BookCharacter bookCharacter);

	
public List<BookCharacter> nameOfGriffonderHouse();

	
	
	public List<BookCharacter> detailsOfFamilyMembersOfHarrypotter();
	
	
	public List<BookCharacter> facultyMembersWhoDie();
	
	public Map<String, List<BookCharacter>> charactersAlive();
	
}
