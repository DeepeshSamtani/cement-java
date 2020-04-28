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
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "graph")
public class Graph {
    @EmbeddedId
    private GraphIdentity graphIdentity;
    @Column(name = "plant_id")
    private String plantId;
    @Column(name = "actual_strength")
    private float actualStrength;
    @Column(name = "prediction_value")
    private float predictionValue;
    @Column(name = "start_time")
    private Date startTime;
    @Column
    private float target;
    @Column
    private float h;
    @Column
    private float hh;
    @Column
    private float hhh;
    @Column
    private float l;
    @Column
    private float ll;
    @Column
    private float lll;
    @Column
    private float lci;
    @Column
    private float uci;

}
