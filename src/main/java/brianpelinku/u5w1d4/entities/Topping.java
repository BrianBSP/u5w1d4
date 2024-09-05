package brianpelinku.u5w1d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Topping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Setter
    private String nome;
    @Setter
    private double kcal;
    @Setter
    private double prezzo;

    public Topping(String nome, double kcal, double prezzo) {
        this.nome = nome;
        this.kcal = kcal;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "nome='" + nome + '\'' +
                ", kcal=" + kcal +
                ", prezzo=" + prezzo +
                '}';
    }
}
