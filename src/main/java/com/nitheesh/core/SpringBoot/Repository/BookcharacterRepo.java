package com.nitheesh.core.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitheesh.core.SpringBoot.entity.BookCharacter;

public interface BookcharacterRepo extends JpaRepository<BookCharacter, Long> {

}
