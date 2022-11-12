public class Animal {
    String species;
    String name;
    Double weight;
    Boolean isAlive;

    Animal(String species) {
        this.isAlive = true;
        this.species = species;
    }
    void feed() {
        if (this.isAlive) {
            this.weight = this.weight + 0.5;
            System.out.println("nom nom thx");
        } else {
            System.out.println("Panie, to martwe przeciez");
        }
    }

    void takeForAWalk() {
        if (this.isAlive) {

            this.weight = this.weight - 0.5;
            System.out.println("Zwierzak schudl");

            if (this.weight <= 0) {
                this.isAlive = false;
                System.out.println("Przesadziles z ta dieta (zdechlo)");
            }

        } else {
            System.out.println("IJO IJO POLICJA WEZWANA");
        }
    }


}
