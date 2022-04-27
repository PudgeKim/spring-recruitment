package developer.recruitment.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RecruitmentPost {

    @Id @GeneratedValue
    private Long id;

    private String title;

    private Boolean isClosed;

    private Boolean isPublished;

    private Long views;

    private String description;

    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
