/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Concretos.Animal;
import Concretos.Jogador;
import Concretos.Usuario;
import Interface.InterfaceAgradecimentosEspeciais;
import Interface.InterfaceAposta;
import Interface.InterfaceCadastro;
import Interface.InterfaceJogoDoBicho;
import Interface.InterfaceLogin;
import Interface.InterfaceResultado;
import static Logica.LogicClass.temUsuario;
import TrataErro.NaoExisteUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author pierr
 */
public class AbreTelas {
    public static void abreCadastro() {
        InterfaceCadastro cadastro = new InterfaceCadastro();
        cadastro.setVisible(true);
    }
    public static void abreCreditos() {
        InterfaceAgradecimentosEspeciais creditos = new InterfaceAgradecimentosEspeciais();
        creditos.setVisible(true);
    }
    public static void abreLogin() {
        InterfaceLogin login = new InterfaceLogin();
        login.setVisible(true);
    }

    public static void abrirAposta(Jogador playerJogador) {
        InterfaceJogoDoBicho telaJogoBicho = new InterfaceJogoDoBicho(playerJogador);
        telaJogoBicho.setVisible(true);
    }

    public static void abrirInterfaceResultado(Jogador playerJogador, Animal resultado) {
        InterfaceResultado dificil = new InterfaceResultado(playerJogador, resultado);
        dificil.setVisible(true);
    }

    public static void abreTelaApostas(Jogador playerJogador, String dificuldade, float valor) {
        InterfaceAposta int_aposta = new InterfaceAposta(playerJogador, dificuldade, valor);
        int_aposta.setVisible(true);
    }
    
    public static void exibeTelaLoginUsers(String login, String senha) throws NaoExisteUsuario {
        Usuario usuario;
        usuario = new Usuario(login, senha, "", "", "");
        String mensagem = "";
        try {
            if (!temUsuario(usuario)) {
                throw new NaoExisteUsuario();
            } else {
                mensagem = "Login efetuado com sucesso";
            }
        } catch (NaoExisteUsuario e) {
            mensagem = e.getMessage();
        } finally {
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}
