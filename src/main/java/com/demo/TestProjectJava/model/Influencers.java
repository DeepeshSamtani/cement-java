package com.demo.TestProjectJava.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "influencers")
public class Influencers {
    @EmbeddedId
    private OverviewIdentity overviewIdentity;
    @Column(name = "plant_id")
    private String plantId;
    @Column(name = "start_time")
    private Date startTime;
    private float tis;
    private String feature;

}
