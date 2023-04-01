package ifTG.travelPlan.domain.travel;

import ifTG.travelPlan.domain.diary.Diary;
import ifTG.travelPlan.domain.travel.destinationroute.DestinationRoute;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.*;

@Embeddable
class TravelPlanDestinationRouteId implements Serializable {
    @Column(name = "travel_plan_id")
    private Integer travelPlanId;

    @Column(name = "destination_id")
    private String destinationId;

    @Column(name = "type")
    private String type;
}

@Entity
@Table(name = "travel_plan_destination_route")
public class TravelPlanDestinationRoute {
    @EmbeddedId
    private TravelPlanDestinationRouteId id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "travel_plan_id", insertable = false, updatable = false)
    private TravelPlan travelPlan;
    @ManyToOne(fetch = LAZY)
    @JoinColumns({
            @JoinColumn(name = "destination_id", referencedColumnName = "destination_id", insertable = false, updatable = false),
            @JoinColumn(name = "type", referencedColumnName = "type", insertable = false, updatable = false)
    })
    private DestinationRoute destinationRoute;
    @Column(nullable = false)
    private int destination_order;
    @Column(nullable = false)
    private LocalDateTime eta;
    //양방향 매핑
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "diary_id")
    private Diary dairy;
}