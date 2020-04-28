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
@Table(name = "overview")
public class Overview {

    @EmbeddedId
    private OverviewIdentity overviewIdentity;
    @Column(name = "plant_id")
    private String plantId;
    @Column(name = "prediction_value")
    private float predictionValue;
    @Column(name = "actual_value")
    private float actualValue;
    @Column
    private Date timestamp;
    @Column
    private String indicator;
    @Column
    protected int ll;
    @Column
    private int hh;

}
