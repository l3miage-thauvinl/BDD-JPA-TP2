package models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("M")
public class ManagerEntity extends EmployeEntity {
    private String niveauGestion;
}
