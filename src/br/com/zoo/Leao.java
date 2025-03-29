package br.com.zoo;

public class Leao extends Animal {
    private String jubaCor; // Atributo específico de Leão

    // Construtor da classe Leao
    public Leao(String nome, int idade, String jubaCor) {
        super(nome, idade); // Chama o construtor da classe pai (Animal)
        this.jubaCor = jubaCor;
        System.out.println("Um novo leão foi criado: " + this.nome);
    }

    // Sobrescrevendo o método fazerSom para Leão
    @Override
    public void fazerSom() {
        System.out.println("ROAR!");
    }

    // Método específico para Leão
    public void mostrarJuba() {
        System.out.println("A cor da juba é: " + this.jubaCor);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o exibirInformacoes da classe pai
        this.mostrarJuba();
    }
}