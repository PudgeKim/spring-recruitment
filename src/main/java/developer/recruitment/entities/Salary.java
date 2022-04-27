package developer.recruitment.entities;

import javax.persistence.*;

@Entity
public class Salary {

    @Id @GeneratedValue
    private Long id;

    private Integer career;

    private Long minSalary;

    private Long maxSalary;

    private Boolean isInclusive;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private Company company;
}
