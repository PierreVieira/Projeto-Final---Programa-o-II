package Abstratos;

import Concretos.Animal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Aposta {
    private ArrayList<Animal> listaAnimaisJogador;
    private String[] nome_animais = {"aguia", "avestruz", "borboleta", "burro", "cachorro", "camelo", "carneiro", "cavalo", "cobra", "coelho", "elefante", "galo", "gato", "jacare", "leao", "macaco", "pato", "pavao", "pica_pau", "porco", "tigre", "touro", "urso", "vaca", "veado"};
    private float valor_recompensa;
    public Aposta(ArrayList<Animal> animais_jogador, float valor_aposta, String dificuldade) {
        listaAnimaisJogador = animais_jogador;
        switch(dificuldade){
            case "facil":
                this.valor_recompensa = (float) (valor_aposta*1.2);
                break;
            case "medio":
                this.valor_recompensa = (float) (valor_aposta*1.5);
                break;
            case "dificil":
                this.valor_recompensa = (float) (valor_aposta*2);
                break;
            default:
                this.valor_recompensa = (float) (valor_aposta*11);
        }
    }

   public Animal resultado(){
       Random random = new Random();
       Animal escolhido = new Animal(nome_animais[random.nextInt(25)]);
       for(Animal animal: this.listaAnimaisJogador){
           if(animal.getNome().equals(escolhido.getNome())){
               escolhido.setEscolhido(true);
               return escolhido;
           }
       }
       return escolhido;
   }

    public float getValor_recompensa() {
        return valor_recompensa;
    }

   
}
