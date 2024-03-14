package models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("D")
public class Developpeur extends Employe{
    private String langagePrefere;
    private String niveauCompetence;
}
