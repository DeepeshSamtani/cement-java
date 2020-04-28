package com.demo.TestProjectJava.repository;

import com.demo.TestProjectJava.model.Overview;
import com.demo.TestProjectJava.model.OverviewIdentity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OverviewRepository extends CrudRepository<Overview, OverviewIdentity> {

}
