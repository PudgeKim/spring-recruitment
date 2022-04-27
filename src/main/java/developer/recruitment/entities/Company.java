package developer.recruitment.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Company {

    @Id @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "company")
    private List<Department> departmentList = new ArrayList<>();

    @OneToMany(mappedBy = "company")
    private List<WelfareProduct> welfareProductList = new ArrayList<>();

    @OneToOne(mappedBy = "company", fetch = FetchType.LAZY)
    private Salary salary;

    @OneToOne(mappedBy = "company", fetch = FetchType.LAZY)
    private MealAllowance mealAllowance;
}
