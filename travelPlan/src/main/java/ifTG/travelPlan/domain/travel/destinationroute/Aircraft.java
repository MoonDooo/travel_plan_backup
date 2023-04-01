package ifTG.travelPlan.domain.travel.destinationroute;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class Aircraft extends DestinationRoute {
    @Column(nullable = false)
    private String airlineName;
    @Column(nullable = false)
    private String startPoint;
    @Column(nullable = false)
    private String endPoint;
    @Column(nullable = false)
    private LocalDateTime startDt;
    @Column(nullable = false)
    private LocalDateTime endDt;
    @Column(nullable = false)
    private float distance;
    private Integer charge;
}
