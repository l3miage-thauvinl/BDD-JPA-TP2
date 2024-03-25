package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProduitEntity {
    @Id
    private long id;
    private String nom;
    private double prix;
    private int quantite;
    @ManyToOne
    private CategorieDeProduitEntity categorie;

}
