package com.nitheesh.core.service;

import java.util.List;

import com.nitheesh.core.entity.BookCharacter;

public interface BookCharacterService {
	
	
	public List<BookCharacter> generateListOfCharacters();
	
	public void nameOfGriffonderHouse(List<BookCharacter> characters);
	
	
	public void detailsOfFamilyMembersOfHarrypotter(List<BookCharacter> characters);
	
	
	public void facultyMembersWhoDie(List<BookCharacter> characters);
	
	public void charactersAlive(List<BookCharacter> characters);
	

}
