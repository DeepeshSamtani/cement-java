package com.demo.TestProjectJava.repository;

import com.demo.TestProjectJava.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, String> {

}
