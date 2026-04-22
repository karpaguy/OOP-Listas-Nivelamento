package br.edu.ifsp.src.main.java.Zoo;

public class Zoo {
    public void main(String[] args) {
        Animal[] animalCages = {new Lion(), new Owl(), new Wolf(), new Lion(), new Owl(),
        new Wolf(), new Owl(), new Owl(), new Lion(), new Owl()};

        for (Animal animal : animalCages) {
            animal.makeSound();
            if (animal instanceof Lion) { ((Lion) animal).run();}
            if (animal instanceof Wolf) { ((Wolf) animal).run(); }
        }

        // Interface resolveria a necessidade de mais de um instanceof se o animal tivesse uma interface "Corredor".
        // animal instanceof Corredor { ((Corredor) animal).run() }
    }
}
