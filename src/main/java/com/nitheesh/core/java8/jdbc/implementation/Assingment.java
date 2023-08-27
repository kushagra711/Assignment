package com.nitheesh.core.java8.jdbc.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assingment {
	
	
	public static List<BookCharacter> generateListOfCharacters(){
		
		List<BookCharacter> characters=new ArrayList<>();
		
		characters.add(new BookCharacter("Harry Potter", "Gryffindor", "Student","Self", "No"));
		
		characters.add(new BookCharacter("Ginny Weasley", "Gryffindor", "Student" ,"Friend" ,"No"));
		
		characters.add(new BookCharacter("Ron Weasley ","Gryffindor", "Student", "Friend" ,"No"));
		
		characters.add(new BookCharacter("Hermione Granger", "Gryffindor", "Student", "Friend", "No"));
		
		characters.add(new BookCharacter("Neville Longbottom", "Gryffindor", "Student", "Friend"," No"));
		
		characters.add(new BookCharacter("Oliver Wood", "Gryffindor", "Student", "Friend", "No"));
		
		characters.add(new BookCharacter("Luna Lovegood", "Ravenclaw", "Student", "Friend", "No"));
		
		characters.add(new BookCharacter("Cho Chang", "Ravenclaw", "Student", "Friend", "No"));
		
		characters.add(new BookCharacter("Cedric Diggory", "Hufflepuff", "Student", "Friend", "Yes"));
		
		characters.add(new BookCharacter("Hannah Abbot", "Hufflepuff", "Student", "Friend", "No"));
		
		characters.add(new BookCharacter("Draco Malfoy", "Slytherin", "Student", "Enemy", "No"));
		
		characters.add(new BookCharacter("Vincent Crabbe", "Slytherin", "Student", "Enemy", "Yes"));
		
		characters.add(new BookCharacter("Gregory Goyle", "Slytherin", "Student", "Enemy", "No"));
		
		characters.add(new BookCharacter("Penelope Clearwater", "Slytherin", "Student", "Enemy", "No"));
		
		characters.add(new BookCharacter("Albus Dumbledore", "Gryffindor", "Faculty", "Friend", "Yes"));
		
		characters.add(new BookCharacter("Severus Snape", "Slytherin", "Faculty", "Enemy", "Yes"));
		
		characters.add(new BookCharacter("Remus Lupin", "Gryffindor", "Faculty", "Friend", "Yes"));
		
		characters.add(new BookCharacter("Horace Slughorn", "Slytherin", "Faculty", "Friend", "No"));
		
		characters.add(new BookCharacter("Rubeus Hagrid", "Gryffindor", "Faculty", "Friend", "No"));
		
		characters.add(new BookCharacter("Minerva McGonagall", "Gryffindor", "Faculty", "Friend", "No"));
		
		characters.add(new BookCharacter("James Potter", "Gryffindor", "Student", "Family", "Yes"));
		
		characters.add(new BookCharacter("Sirius Black", "Gryffindor", "Student", "Friend", "Yes"));
		
		characters.add(new BookCharacter("Lily Potter", "Gryffindor", "Student", "Family", "Yes"));
		
		characters.add(new BookCharacter("Peter Pettigrew", "Gryffindor", "Student", "Enemy", "Yes"));
		
		characters.add(new BookCharacter("Tom Marvolo Riddle","Slytherin", "Student", "Enemy", "Yes"));
		
		return characters;
	}
	
	
	public static void namesOfGriffendorHouse(List<BookCharacter> characters) {
		
		characters.stream().filter((c)-> c.getHouse().equals("Gryffindor")).forEach((i)-> System.out.println(i.getName()));
	}
	
	
	public static void detailsOfFamilyMembersOfHarrypotter(List<BookCharacter> characters) {
		
		characters.stream().filter((c)-> c.getStatus().equals("Family")).forEach((i)-> System.out.println(i));
	}
	
	
	public static void facultyMembersWhoDie(List<BookCharacter> characters) {
		
		characters.stream().filter((c)->c.getRole().equals("Faculty"))
		.filter((f)->f.getDies().equals("Yes"))
		.sorted((a1,b1)-> a1.getName().compareTo(b1.getName()))
		.forEach((i)->System.out.println(i));
		
	}
	
	
	public static void charactersAlive(List<BookCharacter> characters) {
		
		Map<String, List<BookCharacter>> collect = characters.stream().filter((c)->c.getDies().equals("No"))
		.collect(Collectors.groupingBy((g)->g.getHouse()));
		
		//collect.forEach((k,v)-> System.out.println("house ->"+k+" ,"+"characters ->"+v));
		
		collect.keySet().stream().forEach((i)-> System.out.println(i+" "+collect.get(i).stream().map((value)->value.getName()).toList()));
	}
	
	
	
	public static void main(String[] args) {
		
		
		List<BookCharacter> characters=generateListOfCharacters();
		
		namesOfGriffendorHouse(characters);
		
		charactersAlive(characters);
		
		detailsOfFamilyMembersOfHarrypotter(characters);
		
		facultyMembersWhoDie(characters);
		
				
		
		
		
	}

}
