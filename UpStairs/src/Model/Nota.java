package Model;

import Dao.Identifier;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Nota implements Identifier {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private double valor;
    
    @ManyToOne
    private Aluno aluno;
    
    public Nota(){
        this.valor = 0.0;
    }
    public Nota(double valor){
        this.valor = valor;
    }
    
    public double getNota(){
        return this.valor;
    }
    
    public void setNota(double nota){
        this.valor = nota;
    }

    @Override
    public long getId() {
        return this.id;
    }
}
