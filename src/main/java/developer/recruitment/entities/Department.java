package developer.recruitment.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String type; // 백엔드/프론트/Devops 등

    private Integer headCount; // 인원 수

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(mappedBy = "department")
    private List<TechStack> techStackList = new ArrayList<>();
}
