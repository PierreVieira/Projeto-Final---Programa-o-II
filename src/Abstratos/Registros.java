package Abstratos;

import Arquivos.ManipulaArquivosTexto;
import Concretos.Jogador;
import Concretos.Usuario;

public class Registros {
   private ManipulaArquivosTexto files;
   public Registros(String nome_arquivo){
       files = new ManipulaArquivosTexto(nome_arquivo);
   }
   public Registros(){
       
   }
   public void CadastrarUsuario(String nome, String cpf, String contato, String login, String senha) {
        Usuario usuario;
        usuario = new Usuario(login, senha, nome, cpf, contato);
        files.salvarUsuario(usuario);
   }
   public void atualizarJogadores(Jogador jogador){
        ManipulaArquivosTexto.salvarJogador(jogador);
    }
}
