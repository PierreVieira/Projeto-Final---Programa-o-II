package Concretos;

import static Logica.Conversoes.formatar;
import Logica.LogicClass;

public class Jogador extends Usuario{
    private float saldo;
    public Jogador(String login, String senha, String nome, String cpf, String contato, float saldo) {
        super(login, senha, nome, cpf, contato);
        this.saldo = saldo;
    }
    public String converterParaString(){
        return this.toString()+";"+formatar(Float.toString(this.saldo));
    }
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
