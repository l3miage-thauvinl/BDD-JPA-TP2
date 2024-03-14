package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="developper_miage")
public class DevelopperMiage {
    @Id
    @Column(name="lastname")
    private String lastname;
    @Column(name="firstname")
    private String firstname;
    @Column(name="email")
    private String email;

    @JoinTable(name = "developper_miage_project",
            joinColumns = @JoinColumn(name = "lastname"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    @ManyToMany
    private Set<Projet> projects;


}
