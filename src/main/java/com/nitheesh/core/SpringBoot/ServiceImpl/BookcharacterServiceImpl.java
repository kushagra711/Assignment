package com.nitheesh.core.SpringBoot.ServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitheesh.core.SpringBoot.Repository.BookcharacterRepo;
import com.nitheesh.core.SpringBoot.entity.BookCharacter;
import com.nitheesh.core.SpringBoot.service.BookcharacterService;

@Service
public class BookcharacterServiceImpl implements BookcharacterService {
	
	@Autowired
	private BookcharacterRepo bookcharacterRepo;
	

	@Override
	public List<BookCharacter> nameOfGriffonderHouse() {
		List<BookCharacter> collect = bookcharacterRepo.findAll().stream().filter((c)-> c.getHouse().equals("Gryffindor")).collect(Collectors.toList());	
		return collect;
	}

	@Override
	public List<BookCharacter> detailsOfFamilyMembersOfHarrypotter() {
		List<BookCharacter> collect = bookcharacterRepo.findAll().stream().filter((f)->f.getStatus().equals("Family")).collect(Collectors.toList());
		return collect;
	}

	@Override
	public List<BookCharacter> facultyMembersWhoDie() {
		
		List<BookCharacter> collect = bookcharacterRepo.findAll().stream()
				.filter((f)->f.getRole().equals("Faculty"))
				.filter((f)->f.getDies().equals("Yes"))
				.sorted((a,b)->a.getName().compareTo(b.getName()))
				.collect(Collectors.toList());
		
		return collect;
		
	}

	@Override
	public Map<String, List<BookCharacter>> charactersAlive() {

		Map<String, List<BookCharacter>> collect = bookcharacterRepo.findAll().stream().filter((c)->c.getDies().equals("No"))
		.collect(Collectors.groupingBy((g)->g.getHouse()));
		
		
		
		return collect;
	}

	@Override
	public List<BookCharacter> getAllCharacters() {
		
		return bookcharacterRepo.findAll();
	}

	@Override
	public BookCharacter createBookCharacter(BookCharacter bookCharacter) {
		BookCharacter savedBookCharacter=bookcharacterRepo.save(bookCharacter);
		return savedBookCharacter;
	}

}
