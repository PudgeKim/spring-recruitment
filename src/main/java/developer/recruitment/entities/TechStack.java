package developer.recruitment.entities;

import javax.persistence.*;

@Entity
public class TechStack {

    @Id @GeneratedValue
    private Long id;

    private String name; // 기술 이름 (git, python, react..)

    private String type; // 기술 종류 (programming language, webframework..)

    @ManyToOne()
    @JoinColumn(name = "department_id")
    private Department department;
}
