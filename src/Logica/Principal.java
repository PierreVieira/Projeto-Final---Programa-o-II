package Logica;

import Arquivos.FaixasAudio;
import Interface.InterfaceFarmacia;

public class Principal {
    public static final FaixasAudio audios = new FaixasAudio();
    public static void main(String[] args) {
        InterfaceFarmacia in_farmacia = new InterfaceFarmacia();
        in_farmacia.setVisible(true);
    }
}
