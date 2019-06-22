/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Abstratos.Registros;
import Concretos.Jogador;

/**
 *
 * @author pierr
 */
public class LogicaParaArquivos {
    public static void salvarDadosJogador(Jogador jogador){
        Registros registro = new Registros();
        registro.atualizarJogadores(jogador);
    }
}
