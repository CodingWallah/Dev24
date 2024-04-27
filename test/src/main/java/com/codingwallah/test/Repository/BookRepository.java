package com.codingwallah.test.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codingwallah.test.Entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
    //crud opereation , findbyid, 
    //you can customise
}
