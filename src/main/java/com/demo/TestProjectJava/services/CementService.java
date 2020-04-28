package com.demo.TestProjectJava.services;

import com.demo.TestProjectJava.model.Graph;
import com.demo.TestProjectJava.model.Influencers;
import com.demo.TestProjectJava.model.Overall;
import com.demo.TestProjectJava.model.Overview;

import java.util.List;

public interface CementService {
    Iterable<Graph> fetchGraphData();

    Iterable<Influencers> fetchInfluencersData();

    List<Overview> fetchOverviewData();

    Iterable<Overall> fetchOverallData();
}
