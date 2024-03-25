package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="projet")
public class ProjetEntity {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @ManyToMany(mappedBy = "projects")
    private Set<DevelopperMiageEntity> developpers;
}
