package br.com.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void listarAnimais() {
        System.out.println("--- Lista de Animais no Zoológico ---");
        for (Animal animal : this.animais) {
            animal.exibirInformacoes(); // Polimorfismo aqui!
        }
        System.out.println("--- Fim da Lista ---");
    }

    public static void main(String[] args) {
        Zoologico meuZoo = new Zoologico();

        Leao simba = new Leao("Simba", 5, "dourada");
        Elefante dumbo = new Elefante("Dumbo", 10, 3.5);
        Animal animalGenerico = new Animal("Desconhecido", 1);

        meuZoo.adicionarAnimal(simba);
        meuZoo.adicionarAnimal(dumbo);
        meuZoo.adicionarAnimal(animalGenerico);

        meuZoo.listarAnimais();
    }
}
