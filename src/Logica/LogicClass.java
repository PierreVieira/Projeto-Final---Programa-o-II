/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Concretos.Animal;
import Concretos.Usuario;
import Concretos.Jogador;
import Abstratos.Aposta;
import Arquivos.ManipulaArquivosTexto;
import static Logica.AbreTelas.abreCadastro;
import static Logica.AbreTelas.abrirAposta;
import static Logica.AbreTelas.abrirInterfaceResultado;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author pierr
 */
public class LogicClass {

    public static boolean verificaDemacol(String login) {
        return login.contains("@demacol.com");
    }


    public static boolean temUsuario(Usuario usuario) {
        ManipulaArquivosTexto file = new ManipulaArquivosTexto("users");
        Jogador playerJogador;
        for (Usuario usuario2 : file.getUsers()) {
            if (usuario.equals(usuario2)) {
                playerJogador = retornaPlayer(usuario2);
                abrirAposta(playerJogador);
                return true;
            }
        }
        abreCadastro();
        return false;
    }

    public static Jogador retornaPlayer(Usuario usuario) {
        Jogador playerJogador;
        ManipulaArquivosTexto file = new ManipulaArquivosTexto("users");
        for (Jogador player : file.getPlayers()) {
            if (player.equalsUsuario(usuario)) {
                return player;
            }
        }
        playerJogador = criaJogadorPadrao(usuario);
        return playerJogador;
    }

    public static Jogador criaJogadorPadrao(Usuario usuario) {
        //Cria um jogador padrão, com saldo 0
        String login, senha, nome, cpf, contato;
        float saldo;
        login = usuario.getLogin();
        senha = usuario.getSenha();
        nome = usuario.getNome();
        cpf = usuario.getCpf();
        contato = usuario.getContato();
        saldo = 20;
        Jogador playerJogador = new Jogador(login, senha, nome, cpf, contato, saldo);
        return playerJogador;
    }

    

    public static ImageIcon addImagem(String caminho, javax.swing.JLabel label) {
        ImageIcon icon;
        icon = new ImageIcon(caminho);
        icon.setImage(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), 1));
        return icon;
    }

    public static void fazerAposta(Jogador playerJogador, String dificuldade, ArrayList<Animal> animais_escolhidos, float valorAposta) {
        Aposta aposta = new Aposta(animais_escolhidos, valorAposta, dificuldade);
        Animal resultado;
        resultado = aposta.resultado();
        if(resultado.isEscolhido()){ //jogador ganhou dinheiro
            playerJogador.setSaldo(playerJogador.getSaldo() + aposta.getValor_recompensa());
        }
        else{ //jogador perdeu dinheiro
            playerJogador.setSaldo(playerJogador.getSaldo() - valorAposta);
        }
        abrirInterfaceResultado(playerJogador, resultado);
    }
    public static boolean tem_no_array(Animal animal, ArrayList<Animal> animais) {
        for (Animal animal2 : animais) {
            if (animal.getNome().equals(animal2.getNome())) {
                return true;
            }
        }
        return false;
    }
    
}
