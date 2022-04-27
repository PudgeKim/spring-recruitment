package developer.recruitment.entities;

import javax.persistence.*;

@Entity
public class Advertisement {

    @Id @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private AdvertisementGrade advertisementGrade;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

}
