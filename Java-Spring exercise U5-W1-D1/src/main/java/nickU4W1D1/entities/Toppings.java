package nickU4W1D1.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Toppings extends MenùItem {
    private String nome;
    private int calorie;
    private double prezzo;


    public Toppings(String nome, int calorie, double prezzo) {

        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return  "\n" +
                 nome +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '\n';
    }
}
