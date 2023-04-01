package ifTG.travelPlan.domain.user;

import ifTG.travelPlan.domain.user.User;
import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
@Table(name = "user_addresses")
public class UserAddress {

    @Id
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Column(length = 20, nullable = false)
    private String sido;
    @Column(length = 20, nullable = false)
    private String sigungu;

    @Column(length = 20, nullable = false)
    private String eupmyendong;

    @Column(length = 50, nullable = false)
    private String roadName;

    @Column(length = 20, nullable = false)
    private String buildingNumber;

    @Column(length = 10, nullable = false)
    private String zipCode;

    @Column(length = 50, nullable = false)
    private String subBuildingNumber;

}
