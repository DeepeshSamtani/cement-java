package com.demo.TestProjectJava.repository;

import com.demo.TestProjectJava.model.Influencers;
import com.demo.TestProjectJava.model.OverviewIdentity;
import org.springframework.data.repository.CrudRepository;

public interface InfluencersRepository extends CrudRepository<Influencers, OverviewIdentity> {
}
