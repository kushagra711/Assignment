package com.nitheesh.core.SpringBoot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitheesh.core.SpringBoot.entity.BookCharacter;
import com.nitheesh.core.SpringBoot.service.BookcharacterService;

@RestController
@RequestMapping("/bookcharacter")
public class BookCharacterController {
	
	@Autowired
	private BookcharacterService bookcharacterService;
	
	@GetMapping("/getAllCharacters")
	public ResponseEntity<List<BookCharacter>> getAllCharacters(){
		return new ResponseEntity<List<BookCharacter>>(bookcharacterService.getAllCharacters(),HttpStatus.OK);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<BookCharacter> addCharacters(@RequestBody BookCharacter bookCharacter){
		return new ResponseEntity<BookCharacter>(bookcharacterService.createBookCharacter(bookCharacter),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/names/griffandor/house")
	public ResponseEntity<List<BookCharacter>> namesOfGriffandorHouse(){
		return new ResponseEntity<List<BookCharacter>>(bookcharacterService.nameOfGriffonderHouse(),HttpStatus.OK);
	}
	
	@GetMapping("/family/harrypotter")
	public ResponseEntity<List<BookCharacter>> familyOfHarryPotter(){
		return new ResponseEntity<List<BookCharacter>>(bookcharacterService.detailsOfFamilyMembersOfHarrypotter(),HttpStatus.OK);
	}
	
	@GetMapping("/faculty/died")
	public ResponseEntity<List<BookCharacter>> facultyMembersDied(){
		return new ResponseEntity<List<BookCharacter>>(bookcharacterService.facultyMembersWhoDie(),HttpStatus.OK);
	}
	
	@GetMapping("/characters/alive")
	public ResponseEntity<Map<String, List<BookCharacter>>> charactersAlive(){
		
		return new ResponseEntity<Map<String,List<BookCharacter>>>(bookcharacterService.charactersAlive(),HttpStatus.OK);
		
	}
	
	

}
