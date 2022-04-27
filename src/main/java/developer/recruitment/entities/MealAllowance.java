package developer.recruitment.entities;

import javax.persistence.*;

@Entity
public class MealAllowance {

    @Id @GeneratedValue
    private Long id;

    private Integer lunchPrice;

    private Integer dinnerPrice;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;
}
