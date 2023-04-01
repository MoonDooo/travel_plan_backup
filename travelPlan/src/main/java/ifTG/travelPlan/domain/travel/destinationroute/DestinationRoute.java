package ifTG.travelPlan.domain.travel.destinationroute;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "destination_routes")
public abstract class DestinationRoute {
    @Id
    @Column(length = 20, name = "destination_id", nullable = false)
    private String id;

    @Id
    @Column(length = 20, name = "type", nullable = false)
    private String type;

}
