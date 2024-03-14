package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table
public class ClubSportif {
    @Id
    private Long id;
    private String nom;
    private String description;
    @ManyToMany
    private Set<Etudiant> etudiants;

}
