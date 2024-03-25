package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ClientEntity {
    @Id
    private Long id;
    private String nom;
    private String email;
    @OneToMany(mappedBy = "client")
    private Set<CommandeEntity> commandes;
    @OneToOne
    private AdresseEntity adresse;
}
