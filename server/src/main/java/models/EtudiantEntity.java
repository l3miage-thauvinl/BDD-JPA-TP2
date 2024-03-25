package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class EtudiantEntity {
    @Id
    private Long alagan;
    private String nom;
    private String email;
    @JoinTable(name = "etudiant_club_sportif",
            joinColumns = @JoinColumn(name = "etudiant_agalan"),
            inverseJoinColumns = @JoinColumn(name = "club_sportif_id"))
    @ManyToMany
    private Set<ClubSportifEntity> clubSportifEntities;
}
