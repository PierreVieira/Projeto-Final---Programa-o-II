package Arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author pierr
 */
public class FaixasAudio {

    public AudioStream soundJailson;
    public AudioStream soudPinkFloyd;
    public AudioStream soundCountry;
    public AudioStream errou;
    public AudioStream acertou;
    public AudioStream mouse;

    public FaixasAudio() {
        try {
            InputStream in1, in2, in3;
            in1 = new FileInputStream("src/Audios/pai_de_familia_tema.wav");
            in2 = new FileInputStream("src/Audios/pink_floyd-money.wav");
            in3 = new FileInputStream("src/Audios/shes_country.wav");
            soundJailson = new AudioStream(in1);
            soudPinkFloyd = new AudioStream(in2);
            soundCountry = new AudioStream(in3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selecionarMusica(String nomeMusica) {
        switch (nomeMusica) {
            case "soundJailson":
                AudioPlayer.player.stop(soundCountry);
                AudioPlayer.player.stop(soudPinkFloyd);
                AudioPlayer.player.start(soundJailson);
                break;
            case "soundPinkFloyd":
                AudioPlayer.player.stop(soundCountry);
                AudioPlayer.player.stop(soundJailson);
                AudioPlayer.player.start(soudPinkFloyd);
                break;
            case "country":
                AudioPlayer.player.stop(soudPinkFloyd);
                AudioPlayer.player.stop(soundJailson);
                AudioPlayer.player.start(soundCountry);
                break;
            case "errou":
                try {
                    InputStream in4 = new FileInputStream("src/Audios/errou.wav");
                    errou = new AudioStream(in4);
                    AudioPlayer.player.start(errou);
                    break;
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            case "acertou":
                try {
                    InputStream in5 = new FileInputStream("src/Audios/acertou.wav");
                    acertou = new AudioStream(in5);
                    AudioPlayer.player.start(acertou);
                    break;
                } catch (FileNotFoundException ex) {
                   ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            case "mouse":
                try {
                    InputStream in6 = new FileInputStream("src/Audios/mouse_click.wav");
                    mouse = new AudioStream(in6);
                    AudioPlayer.player.start(mouse);
                    break;
                } catch (FileNotFoundException ex) {
                   ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

        }
    }
}
