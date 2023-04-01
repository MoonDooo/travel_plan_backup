package ifTG.travelPlan.domain.travel.destinationroute;

import jakarta.persistence.Column;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EtcMovement extends DestinationRoute {
    @Column(nullable = false)
    private String movementName;
    private float distance;
    private String startPoint;
    private String endPoint;
    private LocalDateTime startDt;
    private LocalDateTime endDt;
    private Integer charge;
}
