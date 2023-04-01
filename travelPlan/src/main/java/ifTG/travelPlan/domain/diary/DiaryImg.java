package ifTG.travelPlan.domain.diary;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
@Table(name = "diary_imgs")
public class DiaryImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diary_img_id")
    private int id;

    @Column(name = "img_url", nullable = false)
    private String imgURL;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "diary_id", nullable = false)
    private Diary diary;
}
