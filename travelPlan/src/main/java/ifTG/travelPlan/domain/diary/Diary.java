package ifTG.travelPlan.domain.diary;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

import static jakarta.persistence.GenerationType.*;

@Entity
@Table(name = "diaries")
public class Diary {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "diary_id")
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime createAt;

    //양방향 매핑
    @OneToMany(mappedBy = "diary", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<DiaryImg> diaryImgList;

}
