package TrataErro;
public class NaoExisteUsuario extends Exception {

    /**
     *Método retorna mensagem de que não existe um usuário com login e senha informados
     * @return
     */
    @Override
    public String getMessage() {
        return "Não há usuário com esse login e senha";
    }
}
