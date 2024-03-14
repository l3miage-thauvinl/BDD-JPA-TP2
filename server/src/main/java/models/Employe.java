package models;

import javax.persistence.*;

@Entity
@Inheritance(strategy =  InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
public class Employe {
    @Id
    private Long id;
    private String nom;
    private String email;
    private double salaire;
}
