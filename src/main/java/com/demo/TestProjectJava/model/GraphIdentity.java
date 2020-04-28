package com.demo.TestProjectJava.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Embeddable
public class GraphIdentity implements Serializable {
    @Column(name = "cement_id")
    private String cementId;
    @Column(name = "prediction_id")
    private String predictionId;
    @Column(name = "sample_id")
    private String sampleId;
    @Column(name = "sample_type")
    private String sampleType;
}
