package com.demo.TestProjectJava.services.impl;

import com.demo.TestProjectJava.model.Graph;
import com.demo.TestProjectJava.model.Influencers;
import com.demo.TestProjectJava.model.Overall;
import com.demo.TestProjectJava.model.Overview;
import com.demo.TestProjectJava.repository.GraphRepository;
import com.demo.TestProjectJava.repository.InfluencersRepository;
import com.demo.TestProjectJava.repository.OverallRepository;
import com.demo.TestProjectJava.repository.OverviewRepository;
import com.demo.TestProjectJava.services.CementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CementServiceImpl implements CementService {

    @Autowired
    private GraphRepository graphRepository;
    @Autowired
    private OverallRepository overallRepository;
    @Autowired
    private InfluencersRepository influencersRepository;
    @Autowired
    private OverviewRepository overviewRepository;

    @Override
    public Iterable<Graph> fetchGraphData() {
        return graphRepository.findAll();
    }

    @Override
    public Iterable<Influencers> fetchInfluencersData() {
        return influencersRepository.findAll();
    }

    @Override
    public List<Overview> fetchOverviewData() {
        return (List<Overview>) overviewRepository.findAll();
    }

    public Iterable<Overall> fetchOverallData() {
        return overallRepository.findAll();
    }
}
