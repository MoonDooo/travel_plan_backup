package ifTG.travelPlan.domain.user;

import ifTG.travelPlan.domain.post.Comment;
import ifTG.travelPlan.domain.post.Post;
import ifTG.travelPlan.domain.travel.TravelPlan;
import jakarta.persistence.*;
import org.hibernate.annotations.BatchSize;

import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.FetchType.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id", length = 20)
    private String id;
    @Column(length = 64, nullable = false)
    private String pw;
    @Column(length = 20, nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    @Column(nullable = false)
    private LocalDate birthDate;
    @Column(length = 20, nullable = false)
    private String phoneNumber;
    private String profileImgUrl;
    @Column(nullable = false)
    private String email;


    //양방향 매핑
    @OneToMany(mappedBy = "user")
    private List<Comment> commentList;
    @OneToMany(mappedBy = "user")
    private List<Post> postList;
    @OneToMany(mappedBy = "user")
    private List<TravelPlan> travelPlans;
    @OneToOne(mappedBy = "user", fetch = LAZY)
    private UserNickname userNickname;
    @OneToOne(mappedBy = "user", fetch = LAZY)
    private UserAddress userAddress;
}
