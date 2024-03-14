package models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("M")
public class Manager extends Employe{
    private String niveauGestion;
}
