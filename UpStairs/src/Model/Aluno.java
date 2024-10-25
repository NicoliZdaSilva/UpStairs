package Model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Aluno extends Pessoa{
    protected String matricula;
    protected List notas;
}
