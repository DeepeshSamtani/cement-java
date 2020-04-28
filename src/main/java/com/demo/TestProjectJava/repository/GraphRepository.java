package com.demo.TestProjectJava.repository;

import com.demo.TestProjectJava.model.Graph;
import com.demo.TestProjectJava.model.GraphIdentity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphRepository extends CrudRepository<Graph, GraphIdentity> {
}
