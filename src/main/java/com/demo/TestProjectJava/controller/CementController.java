package com.demo.TestProjectJava.controller;

import com.demo.TestProjectJava.dto.OverviewDto;
import com.demo.TestProjectJava.model.Graph;
import com.demo.TestProjectJava.model.Influencers;
import com.demo.TestProjectJava.model.Overall;
import com.demo.TestProjectJava.model.Overview;
import com.demo.TestProjectJava.services.CementService;
import com.demo.TestProjectJava.util.mapper.OverviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CementController {

    @Autowired
    private CementService cementService;

    @Autowired
    private OverviewMapper overviewMapper;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/graph")
    public ResponseEntity fetchGraphData() {
        Iterable<Graph> graphList = cementService.fetchGraphData();
        return new ResponseEntity(graphList, HttpStatus.OK);
    }

    @GetMapping("/overview")
    public ResponseEntity fetchOverviewData() {
        List<Overview> overviewList = cementService.fetchOverviewData();
        List<OverviewDto> overviewDtoList = new ArrayList<>();
        overviewList.forEach(element -> {
            OverviewDto overviewDto = overviewMapper.overviewToDto(element);
            overviewDtoList.add(overviewDto);
        });

        return new ResponseEntity(overviewDtoList, HttpStatus.OK);
    }

    @GetMapping("/influencers")
    public ResponseEntity fetchInfluencerData() {
        Iterable<Influencers> influencersList = cementService.fetchInfluencersData();
        return new ResponseEntity(influencersList, HttpStatus.OK);
    }

    @GetMapping("/overall")
    public ResponseEntity fetchOverallData() {
        Iterable<Overall> overallList = cementService.fetchOverallData();
        return new ResponseEntity(overallList, HttpStatus.OK);
    }
}
