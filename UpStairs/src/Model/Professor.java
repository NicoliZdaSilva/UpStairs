package Model;

import java.util.ArrayList;
import javax.persistence.Entity;

@Entity
public class Professor extends Pessoa {
    protected ArrayList<Turmas> turmas;
}
