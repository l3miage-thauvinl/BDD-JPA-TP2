package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdresseEntity {
    @Id
    private Long id;
    private String rue;
    private String numero;
    private String codePostal;
    private String ville;

}
