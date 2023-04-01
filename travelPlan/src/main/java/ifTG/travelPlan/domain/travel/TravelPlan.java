package ifTG.travelPlan.domain.travel;

import ifTG.travelPlan.domain.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;

import java.util.List;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;

@Entity
@Table(name = "travel_plans")
public class TravelPlan {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "travel_plan_id")
    private int travelPlanId;

    @Column(length = 100, nullable = false)
    private String name;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    //양방향 매핑
    @OneToMany(mappedBy = "travelPlan")
    private List<TravelPlanDestinationRoute> travelPlanDestinationRoute;
}
