/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivos;

import Concretos.Jogador;
import Concretos.Usuario;
import static Logica.Conversoes.converteStringParaPlayer;
import static Logica.Conversoes.converteStringParaUsuario;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pierr
 */
public class ManipulaArquivosTexto {

    private String nome_arquivo, mensagem;
    private ArrayList<Usuario> users;
    private ArrayList<Jogador> jogadores;
    public ManipulaArquivosTexto(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
        this.mensagem = "";
        this.users = new ArrayList<>();
        this.jogadores = new ArrayList<>();
        if (nome_arquivo.equals("users")) {
            alocar_usuarios();
        }
    }

    public void salvarUsuario(Usuario usuario) {
        try {
            FileWriter escritor = new FileWriter(this.nome_arquivo + ".txt", true);
            BufferedWriter bw = new BufferedWriter(escritor);
            bw.write(usuario.toString());
            bw.newLine();
            bw.close();
            mensagem = "Usuário salvo com sucesso";
        } catch (IOException e) {
            mensagem = "Erro de escrita no arquivo" + this.nome_arquivo;
        } finally {
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    private void alocar_usuarios() {
        Scanner scanner;
        String leitura_do_arquivo;
        Usuario usuario;
        this.users.clear();
        try {
            scanner = new Scanner(new FileReader(this.nome_arquivo + ".txt"));
            while (scanner.hasNext()) {
                leitura_do_arquivo = scanner.nextLine();
                usuario = converteStringParaUsuario(leitura_do_arquivo);
                this.users.add(usuario);
            }
            mensagem = "Leitura realizada com sucesso";
        } catch (IOException e) {
            e.printStackTrace();
            mensagem = "Não foi possivel ler o conteúdo do arquivo";
        } finally {
            System.out.println(mensagem);
        }
        alocar_jogadores();
    }

    public ArrayList<Usuario> getUsers() {
        return users;
    }

    public static void salvarJogador(Jogador jogador) {
        if (!existe_o_jogador(jogador)) {
            salvarJogadorNovo(jogador);
        } else {
            atualizarJogador(jogador);
        }
    }

    public static boolean existe_o_jogador(Jogador jogador) {
        Scanner scanner = null;
        String leitura_do_arquivo;
        Jogador jogador2;
        try {
            scanner = new Scanner(new FileReader("players.txt"));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível abrir o arquivo players");
        }
        while (scanner.hasNext()) {
            leitura_do_arquivo = scanner.nextLine();
            jogador2 = converteStringParaPlayer(leitura_do_arquivo);
            if (jogador.equals(jogador2)) {
                return true;
            }
        }
        return false;

    }

    private  static void salvarJogadorNovo(Jogador jogador) {
        try {
            FileWriter escritor = new FileWriter("players.txt", true);
            BufferedWriter bw = new BufferedWriter(escritor);
            bw.write(jogador.converterParaString());
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void atualizarJogador(Jogador jogador) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Scanner scanner = null;
        String leitura_do_arquivo;
        Jogador jogador2;
        try {
             scanner = new Scanner(new FileReader("players.txt"));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível abrir o arquivo players");
        }
        while (scanner.hasNext()) {
            leitura_do_arquivo = scanner.nextLine();
            jogador2 = converteStringParaPlayer(leitura_do_arquivo);
            jogadores.add(jogador2);
        }
        for(Jogador jogador3: jogadores){
            if(jogador.equals(jogador3)){
                jogadores.get(jogadores.indexOf(jogador3)).setSaldo(jogador.getSaldo());
            }
        }
        try {
            FileWriter escritor = new FileWriter("players.txt");
            BufferedWriter bw = new BufferedWriter(escritor);
            for(Jogador jogador4: jogadores){
                bw.write(jogador4.converterParaString());
                bw.newLine();
            }
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void alocar_jogadores() {
        Scanner scanner = null;
        Jogador jogador2;
        String leitura_do_arquivo;
        try {
            scanner = new Scanner(new FileReader("players.txt"));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível abrir o arquivo players");
        }
        while (scanner.hasNext()) {
            leitura_do_arquivo = scanner.nextLine();
            jogador2 = converteStringParaPlayer(leitura_do_arquivo);
            this.jogadores.add(jogador2);
        }
    }

    public ArrayList<Jogador> getPlayers() {
        return jogadores;
    }
    
}
