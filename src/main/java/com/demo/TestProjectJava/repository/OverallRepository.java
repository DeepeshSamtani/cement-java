package com.demo.TestProjectJava.repository;

import com.demo.TestProjectJava.model.Overall;
import com.demo.TestProjectJava.model.Overview;
import com.demo.TestProjectJava.model.OverviewIdentity;
import org.springframework.data.repository.CrudRepository;

public interface OverallRepository extends CrudRepository<Overall, OverviewIdentity> {
}
