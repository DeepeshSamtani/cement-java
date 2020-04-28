package com.demo.TestProjectJava.dto;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class OverviewDto {
    private String predictionType;
    private String cementId;
    private String sampleId;
    private String plantId;
    private float predictionValue;
    private float actualValue;
    private Date timestamp;
    private String indicator;
    private float ll;
    private float hh;
}
