package com.demo.TestProjectJava.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Embeddable
public class OverviewIdentity implements Serializable {
    @Column(name = "cement_id")
    private String cementId;
    @Column(name = "prediction_type")
    private String predictionType;
    @Column(name = "sample_id")
    private String sampleId;
}
