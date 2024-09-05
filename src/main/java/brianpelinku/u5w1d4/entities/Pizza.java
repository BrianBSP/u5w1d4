package brianpelinku.u5w1d4.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String nome;
    private double kcal;
    private double prezzo;
    @OneToMany
    private List<Topping> listaTopping;

    // costruttori
    public Pizza() {
    }

    public Pizza(String nome, List<Topping> listaTopping) {
        this.nome = nome;
        this.kcal = setKcal(listaTopping);
        this.prezzo = setPrezzo(listaTopping);
        this.listaTopping = listaTopping;
    }

    // getter e setter

    public int setKcal(List<Topping> listaTopping) {
        int tot = 1200;
        if (listaTopping != null) {
            for (Topping topping : listaTopping) {
                tot += topping.getKcal();
            }
        }
        return tot;
    }

    public double setPrezzo(List<Topping> listaTopping) {
        double tot = 4.5;
        if (listaTopping != null) {
            for (Topping topping : listaTopping) {
                tot += topping.getPrezzo();
            }
        }
        return tot;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", kcal=" + kcal +
                ", prezzo=" + prezzo +
                ", listaTopping=" + listaTopping/*.stream().map(Object::toString).toList()*/ +
                '}';
    }
}
