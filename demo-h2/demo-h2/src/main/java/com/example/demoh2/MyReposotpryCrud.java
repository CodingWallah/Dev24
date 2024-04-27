package com.example.demoh2;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// @Repository
// public interface MyReposotpryCrud extends CrudRepository<User, Integer>{

// }

@Repository
public interface MyReposotpryCrud extends JpaRepository<User, Integer>{

}
