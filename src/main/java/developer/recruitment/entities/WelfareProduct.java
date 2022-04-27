package developer.recruitment.entities;

import javax.persistence.*;

@Entity
public class WelfareProduct {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String brand;

    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;


}
