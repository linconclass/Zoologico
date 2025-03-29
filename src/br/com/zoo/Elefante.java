package br.com.zoo;

public class Elefante extends Animal {
    private double tamanhoTromba; // Atributo específico de Elefante

    public Elefante(String nome, int idade, double tamanhoTromba) {
        super(nome, idade);
        this.tamanhoTromba = tamanhoTromba;
        System.out.println("Um novo elefante foi criado: " + this.nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("UUUUUUUUUUUUUUUUUU!");
    }

    public void mostrarTromba() {
        System.out.println("O tamanho da tromba é: " + this.tamanhoTromba + " metros");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        this.mostrarTromba();
    }
}
