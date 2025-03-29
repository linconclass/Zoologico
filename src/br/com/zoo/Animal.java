package br.com.zoo;

public class Animal {
    String nome;
    int idade;

    //Construtor da classe Animal
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("um novo animal foi criado: "+this.nome);
    }
    //Metodo para o animal fazer um som genérico
    public void fazerSom() {
        System.out.println("O animal fez um Som");
    }
    public void exibirInformacoes() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade+" anos");
        this.fazerSom(); //Caham o metodo fazerSom para o animal especifico.
        System.out.println("---");
    }
}
