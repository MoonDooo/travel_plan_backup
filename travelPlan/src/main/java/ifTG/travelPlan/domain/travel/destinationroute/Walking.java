package ifTG.travelPlan.domain.travel.destinationroute;

import jakarta.persistence.Column;

public class Walking extends DestinationRoute {
    @Column(nullable = false)
    private float distance;

}
