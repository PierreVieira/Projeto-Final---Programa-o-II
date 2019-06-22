package Concretos;

public class Usuario extends Pessoa {

    private String login;
    private String senha;

    public Usuario(String login, String senha, String nome, String cpf, String contato) {
        super(nome, cpf, contato);
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return this.getNome() + ";" + this.getCpf() + ";" + this.getContato() + ";" + this.login + ";" + this.senha;
    }

    public boolean equalsUsuario(Usuario usuario) {
        return this.getLogin().equals(usuario.getLogin()) && this.getSenha().equals(usuario.getSenha());
    }

    public boolean equals(Usuario usuario) {
        return this.login.equals(usuario.login) && this.senha.equals(usuario.senha);
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

}
