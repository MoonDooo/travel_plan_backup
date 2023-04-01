package ifTG.travelPlan.domain.user;

import ifTG.travelPlan.domain.user.User;
import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
@Table(name = "user_nicknames")
public class UserNickname {
    @Id
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(length = 30, nullable = false)
    private String nickname;

}
