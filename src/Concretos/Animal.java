package Concretos;
public class Animal {
    private String nome;
    private boolean escolhido; //serve para saber se o animal em questão foi escolhido pelo jogador
    public Animal(String nome){
        this.nome = nome;
        this.escolhido = false;
    }
    public boolean equals(Animal animal){
        return this.nome.equals(animal.nome)&&(this.escolhido == animal.escolhido);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEscolhido() {
        return escolhido;
    }

    public void setEscolhido(boolean escolhido) {
        this.escolhido = escolhido;
    }
    
}
