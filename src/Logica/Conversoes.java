/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Concretos.Jogador;
import Concretos.Usuario;

/**
 *
 * @author pierr
 */
public class Conversoes {
    public static Usuario converteStringParaUsuario(String leitura_do_arquivo) {
        Usuario usuario;
        String nome, cpf, contato, login, senha;
        String[] strings;
        strings = leitura_do_arquivo.split(";");
        nome = strings[0];
        cpf = strings[1];
        contato = strings[2];
        login = strings[3];
        senha = strings[4];
        usuario = new Usuario(login, senha, nome, cpf, contato);
        return usuario;
    }
    public static Jogador converteStringParaPlayer(String leitura_do_arquivo) {
        Jogador player;
        String nome, cpf, contato, login, senha, saldo;
        String[] strings = leitura_do_arquivo.split(";");
        nome = strings[0];
        cpf = strings[1];
        contato = strings[2];
        login = strings[3];
        senha = strings[4];
        saldo = strings[5];
        player = new Jogador(login, senha, nome, cpf, contato, Float.parseFloat(saldo));
        return player;
    }
    public static String formatar(String valor) {
        String s = "";
        char letra;
        int aux;
        for(int i = 0; i < valor.length();i++){
            letra = valor.charAt(i);
            s += letra;
            if(s.length() > 5){
                break;
            }
        }
        return s;
    }
}
