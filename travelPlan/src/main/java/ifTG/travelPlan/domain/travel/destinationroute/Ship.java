package ifTG.travelPlan.domain.travel.destinationroute;

import jakarta.persistence.Column;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public class Ship extends DestinationRoute {
    @Column(nullable = false)
    private String shipName;
    @Column(nullable = false)
    private String startPoint;
    @Column(nullable = false)
    private String endPoint;
    @Column(nullable = false)
    private LocalDateTime startDt;
    @Column(nullable = false)
    private LocalDateTime endDtt;
    private Integer charge;
}
