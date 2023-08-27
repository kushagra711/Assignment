package com.nitheesh.core;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nitheesh.core.SpringBoot.Repository.BookcharacterRepo;
import com.nitheesh.core.config.Config;
import com.nitheesh.core.entity.BookCharacter;
import com.nitheesh.core.service.BookCharacterService;
import com.nitheesh.core.service.Client;
import com.nitheesh.core.service.JdbcService;
import com.nitheesh.core.serviceImpl.BookCharacterServiceImpl;
import com.nitheesh.core.serviceImpl.ClientImpl;
import com.nitheesh.core.serviceImpl.JdbcServiceImpl;

@SpringBootApplication
public class SpringCoreIntegrationApplication  {
	
	@Autowired
	private BookCharacterService bookCharacterService;
	
	@Autowired
	private BookcharacterRepo repo;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		SpringApplication.run(SpringCoreIntegrationApplication.class, args);
		
		
		                            // implementing the harry potter assingment using spring core...
		
		
		//AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
			
	                                     // getting bean of  jdbcService..	
	
//		JdbcService jdbcService=context.getBean(JdbcServiceImpl.class);
//	     jdbcService.CreateDriver();
//		
//		jdbcService.establishConnection("jdbc://localhost:3306/jdbcprac","root","Nitheeshreddy143@");
//		
		
		                                  // getting the bean of client class...
		
//		Client client=context.getBean(ClientImpl.class);
//		client.createBookseries();
//		
//		List<BookCharacter> characters=client.getBookcharacters();
		
		
	                                   // getting the bean of bookcharacterService..
		
		
//		
//	BookCharacterService service=context.getBean(BookCharacterServiceImpl.class);
//				
//	service.nameOfGriffonderHouse(characters);
//	service.charactersAlive(characters);
//	
//	service.detailsOfFamilyMembersOfHarrypotter(characters);
//	
//	service.facultyMembersWhoDie(characters);
	
		
		
	                                  //closing the jdbc connections
	
	//jdbcService.closeAll();
		
	                                // cloisnf the annotationconfig application contex
	
    // context.close();
				
		
	}

		
	
	
	
	
	

}
