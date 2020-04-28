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
@Table(name = "overall")
public class Overall {
    @EmbeddedId
    private OverviewIdentity overviewIdentity;
    @Column(name = "last_mae")
    private float lastMae;
    @Column
    private float mae;
    @Column(name = "standard_deviation")
    private float standardDeviation;
    @Column(name = "last_standard_deviation")
    private float lastStandardDeviation;
    @Column
    private int observations;
    @Column(name = "threshold_Accuracy")
    private float thresholdAccuracy;
    @Column(name = "last_threshold_accuracy")
    private float lastThresholdAccuracy;
    @Column(name = "timestamp_in")
    private Date timestampIn;
    @Column(name = "trending_accuracy")
    private float trendingAccuracy;
    @Column(name = "last_trending_accuracy")
    private float lastTrendingAccuracy;

}
