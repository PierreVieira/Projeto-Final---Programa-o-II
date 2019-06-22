/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Concretos.Animal;
import Concretos.Jogador;
import static Logica.Conversoes.formatar;
import Logica.LogicClass;
import static Logica.LogicClass.fazerAposta;
import static Logica.LogicaParaArquivos.salvarDadosJogador;
import Logica.Principal;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pierr
 */
public class InterfaceAposta extends javax.swing.JFrame {
    
    /**
     * Creates new form InterfaceAposta
     */
    private Jogador jogador;
    private String dificuldade;
    private int saldo_bichos;
    private float saldo_jogador, valor_aposta;
    private ArrayList<Animal> animais_escolhidos;
    public InterfaceAposta(Jogador jogador, String dificuldade, float valor_aposta) {
        initComponents();
        setLocationRelativeTo( null );
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.valor_aposta = valor_aposta;
        switch(dificuldade){
            case "facil":
                saldo_bichos = 12;
                break;
            case "medio":
                saldo_bichos = 9;
                break;
            case "dificil":
                saldo_bichos = 7;
                break;
            case "fodas":
                saldo_bichos = 1;
                break;
        }
        animais_escolhidos = new ArrayList();
        this.jogador = jogador;
        this.dificuldade = dificuldade;
        this.saldo_jogador = jogador.getSaldo();
        this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
        this.lblSaldoDisponivel.setText("Saldo disponível: "+formatar(Float.toString(this.saldo_jogador)));
        Color Cor = new Color(0, 0, 0);
        getContentPane().setBackground(Cor);
        //Aguia
        lblAguia.setIcon(LogicClass.addImagem("src/Imagens/aguia_sem_borda.png", lblAguia));
        //Avestruz
        lblAvestruz.setIcon(LogicClass.addImagem("src/Imagens/avestruz_sem_borda.png", lblAvestruz));
        //Borboleta
        lblBorboleta.setIcon(LogicClass.addImagem("src/Imagens/borboleta_sem_borda.png", lblBorboleta));
        //Burro
        lblBurro.setIcon(LogicClass.addImagem("src/Imagens/burro_sem_borda.png", lblBurro));
        //Cachorro
        lblCachorro.setIcon(LogicClass.addImagem("src/Imagens/cachorro_sem_borda.png", lblCachorro));
        //Camelo
        lblCamelo.setIcon(LogicClass.addImagem("src/Imagens/camelo_sem_borda.png", lblCamelo));
        //Carneiro
        lblCarneiro.setIcon(LogicClass.addImagem("src/Imagens/carneiro_sem_borda.png", lblCarneiro));
        //Cavalo
        lblCavalo.setIcon(LogicClass.addImagem("src/Imagens/cavalo_sem_borda.png", lblCavalo));
        //Cobra
        lblCobra.setIcon(LogicClass.addImagem("src/Imagens/cobra_sem_borda.png", lblCobra));
        //Coelho
        lblCoelho.setIcon(LogicClass.addImagem("src/Imagens/coelho_sem_borda.png", lblCoelho));
        //Elefante
        lblElefante.setIcon(LogicClass.addImagem("src/Imagens/elefante_sem_borda.png", lblElefante));
        //Galo
        lblGalo.setIcon(LogicClass.addImagem("src/Imagens/galo_sem_borda.png", lblGalo));
        //Gato
        lblGato.setIcon(LogicClass.addImagem("src/Imagens/gato_sem_borda.png", lblGato));
        //Jacare
        lblJacare.setIcon(LogicClass.addImagem("src/Imagens/jacare_sem_borda.png", lblJacare));
        //Leao
        lblLeao.setIcon(LogicClass.addImagem("src/Imagens/leao_sem_borda.png", lblLeao));
        //Macaco
        lblMacaco.setIcon(LogicClass.addImagem("src/Imagens/macaco_sem_borda.png", lblMacaco));
        //Pato
        lblPato.setIcon(LogicClass.addImagem("src/Imagens/pato_sem_borda.png", lblPato));
        //Pavao
        lblPavao.setIcon(LogicClass.addImagem("src/Imagens/pavao_sem_borda.png", lblPato));
        //Pica-pau
        lblPicaPau.setIcon(LogicClass.addImagem("src/Imagens/pica_pau_sem_borda.png", lblPicaPau));
        //Porco
        lblPorco.setIcon(LogicClass.addImagem("src/Imagens/porco_sem_borda.png", lblPorco));
        //Tigre
        lblTigre.setIcon(LogicClass.addImagem("src/Imagens/tigre_sem_borda.png", lblTigre));
        //Touro
        lblTouro.setIcon(LogicClass.addImagem("src/Imagens/touro_sem_borda.png", lblTouro));
        //Urso
        lblUrso.setIcon(LogicClass.addImagem("src/Imagens/urso_sem_borda.png", lblUrso));
        //Vaca
        lblVaca.setIcon(LogicClass.addImagem("src/Imagens/vaca_sem_borda.png", lblVaca));
        //Veado
        lblVeado.setIcon(LogicClass.addImagem("src/Imagens/veado_sem_borda.png", lblVeado));
        //--------------------------------------------------------------------------------------
        lblSair.setIcon(LogicClass.addImagem("src/Imagens/btn_sair_sem_borda.png", lblSair));
        lblApostar1.setIcon(LogicClass.addImagem("src/Imagens/btn_sortear_sem_borda.png", lblApostar1));
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCamelo = new javax.swing.JLabel();
        lblElefante = new javax.swing.JLabel();
        lblAguia = new javax.swing.JLabel();
        lblTigre = new javax.swing.JLabel();
        lblMacaco = new javax.swing.JLabel();
        lblPato = new javax.swing.JLabel();
        lblTouro = new javax.swing.JLabel();
        lblGalo = new javax.swing.JLabel();
        lblCarneiro = new javax.swing.JLabel();
        lblAvestruz = new javax.swing.JLabel();
        lblCavalo = new javax.swing.JLabel();
        lblGato = new javax.swing.JLabel();
        lblBorboleta = new javax.swing.JLabel();
        lblPavao = new javax.swing.JLabel();
        lblUrso = new javax.swing.JLabel();
        lblPicaPau = new javax.swing.JLabel();
        lblJacare = new javax.swing.JLabel();
        lblBurro = new javax.swing.JLabel();
        lblVaca = new javax.swing.JLabel();
        lblCobra = new javax.swing.JLabel();
        lblCachorro = new javax.swing.JLabel();
        lblPorco = new javax.swing.JLabel();
        lblVeado = new javax.swing.JLabel();
        lblCoelho = new javax.swing.JLabel();
        lblLeao = new javax.swing.JLabel();
        lblSaldoDisponivel = new javax.swing.JLabel();
        lblAnimaisDisponiveis = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        lblApostar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCamelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/camelo_com_borda.png"))); // NOI18N
        lblCamelo.setText("jLabel1");
        lblCamelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCameloMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCameloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCameloMouseExited(evt);
            }
        });

        lblElefante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/elefante_com_borda.png"))); // NOI18N
        lblElefante.setText("jLabel1");
        lblElefante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblElefanteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblElefanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblElefanteMouseExited(evt);
            }
        });

        lblAguia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/aguia_com_borda.png"))); // NOI18N
        lblAguia.setText("jLabel1");
        lblAguia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAguiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAguiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAguiaMouseExited(evt);
            }
        });

        lblTigre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tigre_com_borda.png"))); // NOI18N
        lblTigre.setText("jLabel1");
        lblTigre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTigreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTigreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTigreMouseExited(evt);
            }
        });

        lblMacaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/macaco_com_borda.png"))); // NOI18N
        lblMacaco.setText("jLabel1");
        lblMacaco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMacacoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMacacoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMacacoMouseExited(evt);
            }
        });

        lblPato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pato_com_borda.png"))); // NOI18N
        lblPato.setText("jLabel1");
        lblPato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPatoMouseExited(evt);
            }
        });

        lblTouro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/touro_com_borda.png"))); // NOI18N
        lblTouro.setText("jLabel1");
        lblTouro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTouroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTouroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTouroMouseExited(evt);
            }
        });

        lblGalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/galo_com_borda.png"))); // NOI18N
        lblGalo.setText("jLabel1");
        lblGalo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGaloMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGaloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGaloMouseExited(evt);
            }
        });

        lblCarneiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carneiro_com_borda.png"))); // NOI18N
        lblCarneiro.setText("jLabel1");
        lblCarneiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarneiroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCarneiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCarneiroMouseExited(evt);
            }
        });

        lblAvestruz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/avestruz_com_borda.png"))); // NOI18N
        lblAvestruz.setText("jLabel1");
        lblAvestruz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAvestruzMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAvestruzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAvestruzMouseExited(evt);
            }
        });

        lblCavalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cavalo_com_borda.png"))); // NOI18N
        lblCavalo.setText("jLabel1");
        lblCavalo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCavaloMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCavaloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCavaloMouseExited(evt);
            }
        });

        lblGato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/gato_com_borda.png"))); // NOI18N
        lblGato.setText("jLabel1");
        lblGato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGatoMouseExited(evt);
            }
        });

        lblBorboleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/borboleta_com_borda.png"))); // NOI18N
        lblBorboleta.setText("jLabel1");
        lblBorboleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorboletaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBorboletaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBorboletaMouseExited(evt);
            }
        });

        lblPavao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pavao_com_borda.png"))); // NOI18N
        lblPavao.setText("jLabel1");
        lblPavao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPavaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPavaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPavaoMouseExited(evt);
            }
        });

        lblUrso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/urso_com_borda.png"))); // NOI18N
        lblUrso.setText("jLabel1");
        lblUrso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUrsoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUrsoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUrsoMouseExited(evt);
            }
        });

        lblPicaPau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pica_pau_com_borda.png"))); // NOI18N
        lblPicaPau.setText("jLabel1");
        lblPicaPau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPicaPauMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPicaPauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPicaPauMouseExited(evt);
            }
        });

        lblJacare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jacare_com_borda.png"))); // NOI18N
        lblJacare.setText("jLabel1");
        lblJacare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJacareMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJacareMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJacareMouseExited(evt);
            }
        });

        lblBurro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/burro_com_borda.png"))); // NOI18N
        lblBurro.setText("jLabel1");
        lblBurro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBurroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBurroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBurroMouseExited(evt);
            }
        });

        lblVaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/vaca_com_borda.png"))); // NOI18N
        lblVaca.setText("jLabel1");
        lblVaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVacaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVacaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVacaMouseExited(evt);
            }
        });

        lblCobra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cobra_com_borda.png"))); // NOI18N
        lblCobra.setText("jLabel1");
        lblCobra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCobraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCobraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCobraMouseExited(evt);
            }
        });

        lblCachorro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cachorro_com_borda.png"))); // NOI18N
        lblCachorro.setText("jLabel1");
        lblCachorro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCachorroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCachorroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCachorroMouseExited(evt);
            }
        });

        lblPorco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/porco_com_borda.png"))); // NOI18N
        lblPorco.setText("jLabel1");
        lblPorco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPorcoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPorcoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPorcoMouseExited(evt);
            }
        });

        lblVeado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/veado_com_borda.png"))); // NOI18N
        lblVeado.setText("jLabel1");
        lblVeado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVeadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVeadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVeadoMouseExited(evt);
            }
        });

        lblCoelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/coelho_com_borda.png"))); // NOI18N
        lblCoelho.setText("jLabel1");
        lblCoelho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCoelhoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCoelhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCoelhoMouseExited(evt);
            }
        });

        lblLeao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/leao_com_borda.png"))); // NOI18N
        lblLeao.setText("jLabel1");
        lblLeao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLeaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLeaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLeaoMouseExited(evt);
            }
        });

        lblSaldoDisponivel.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        lblSaldoDisponivel.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldoDisponivel.setText("Saldo Disponível: R$ 00,00");

        lblAnimaisDisponiveis.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        lblAnimaisDisponiveis.setForeground(new java.awt.Color(255, 255, 255));
        lblAnimaisDisponiveis.setText("Apostas disponíveis: 0");

        lblSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_sair_sem_borda.png"))); // NOI18N
        lblSair.setText("Sair");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairMouseExited(evt);
            }
        });

        lblApostar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_sair_sem_borda.png"))); // NOI18N
        lblApostar1.setText("Apostar");
        lblApostar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblApostar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblApostar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblApostar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTigre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAguia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElefante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCamelo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMacaco, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvestruz, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGalo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarneiro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUrso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBorboleta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCavalo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPavao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBurro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJacare, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCobra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPicaPau, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVeado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPorco, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoelho, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaldoDisponivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAnimaisDisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApostar1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSaldoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAnimaisDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(lblApostar1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(lblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblBurro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCobra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblJacare, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPicaPau, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblVaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblBorboleta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCavalo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblGato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPavao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblUrso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAvestruz, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCarneiro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblGalo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAguia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCamelo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblElefante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMacaco, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblTigre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCoelho, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPorco, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblVeado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAguiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAguiaMouseEntered
        Animal animal = new Animal("aguia");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblAguia.setIcon(LogicClass.addImagem("src/Imagens/aguia_com_borda_cinza.png", lblAguia));
        }
        else{
            lblAguia.setIcon(LogicClass.addImagem("src/Imagens/aguia_com_borda.png", lblAguia));
        }  
    }//GEN-LAST:event_lblAguiaMouseEntered

    private void lblAguiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAguiaMouseExited
        Animal animal = new Animal("aguia");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblAguia.setIcon(LogicClass.addImagem("src/Imagens/aguia_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblAguia.setIcon(LogicClass.addImagem("src/Imagens/aguia_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblAguiaMouseExited

    private void lblAvestruzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvestruzMouseEntered
        Animal animal = new Animal("avestruz");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblAvestruz.setIcon(LogicClass.addImagem("src/Imagens/avestruz_com_borda_cinza.png", lblAguia));
        }
        else{
            lblAvestruz.setIcon(LogicClass.addImagem("src/Imagens/avestruz_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblAvestruzMouseEntered

    private void lblAvestruzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvestruzMouseExited
        Animal animal = new Animal("avestruz");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblAvestruz.setIcon(LogicClass.addImagem("src/Imagens/avestruz_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblAvestruz.setIcon(LogicClass.addImagem("src/Imagens/avestruz_sem_borda.png", lblAguia));
        }    
    }//GEN-LAST:event_lblAvestruzMouseExited

    private void lblBorboletaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorboletaMouseEntered
        Animal animal = new Animal("borboleta");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblBorboleta.setIcon(LogicClass.addImagem("src/Imagens/borboleta_com_borda_cinza.png", lblAguia));
        }
        else{
            lblBorboleta.setIcon(LogicClass.addImagem("src/Imagens/borboleta_com_borda.png", lblAguia));
        } 
    }//GEN-LAST:event_lblBorboletaMouseEntered

    private void lblBorboletaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorboletaMouseExited
        Animal animal = new Animal("borboleta");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblBorboleta.setIcon(LogicClass.addImagem("src/Imagens/borboleta_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblBorboleta.setIcon(LogicClass.addImagem("src/Imagens/borboleta_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblBorboletaMouseExited

    private void lblBurroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBurroMouseEntered
        Animal animal = new Animal("burro");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblBurro.setIcon(LogicClass.addImagem("src/Imagens/burro_com_borda_cinza.png", lblAguia));
        }
        else{
            lblBurro.setIcon(LogicClass.addImagem("src/Imagens/burro_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblBurroMouseEntered

    private void lblBurroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBurroMouseExited
       Animal animal = new Animal("burro");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblBurro.setIcon(LogicClass.addImagem("src/Imagens/burro_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblBurro.setIcon(LogicClass.addImagem("src/Imagens/burro_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblBurroMouseExited

    private void lblCachorroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCachorroMouseEntered
       Animal animal = new Animal("cachorro");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCachorro.setIcon(LogicClass.addImagem("src/Imagens/cachorro_com_borda_cinza.png", lblAguia));
        }
        else{
            lblCachorro.setIcon(LogicClass.addImagem("src/Imagens/cachorro_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCachorroMouseEntered

    private void lblCachorroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCachorroMouseExited
        Animal animal = new Animal("cachorro");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCachorro.setIcon(LogicClass.addImagem("src/Imagens/cachorro_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblCachorro.setIcon(LogicClass.addImagem("src/Imagens/cachorro_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCachorroMouseExited

    private void lblCameloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCameloMouseEntered
      Animal animal = new Animal("camelo");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCamelo.setIcon(LogicClass.addImagem("src/Imagens/camelo_com_borda_cinza.png", lblAguia));
        }
        else{
            lblCamelo.setIcon(LogicClass.addImagem("src/Imagens/camelo_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCameloMouseEntered

    private void lblCameloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCameloMouseExited
       Animal animal = new Animal("camelo");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCamelo.setIcon(LogicClass.addImagem("src/Imagens/camelo_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblCamelo.setIcon(LogicClass.addImagem("src/Imagens/camelo_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCameloMouseExited

    private void lblCarneiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarneiroMouseEntered
       Animal animal = new Animal("carneiro");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCarneiro.setIcon(LogicClass.addImagem("src/Imagens/carneiro_com_borda_cinza.png", lblAguia));
        }
        else{
            lblCarneiro.setIcon(LogicClass.addImagem("src/Imagens/carneiro_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCarneiroMouseEntered

    private void lblCarneiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarneiroMouseExited
      Animal animal = new Animal("carneiro");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCarneiro.setIcon(LogicClass.addImagem("src/Imagens/carneiro_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblCarneiro.setIcon(LogicClass.addImagem("src/Imagens/carneiro_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCarneiroMouseExited

    private void lblCavaloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCavaloMouseEntered
       Animal animal = new Animal("cavalo");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCavalo.setIcon(LogicClass.addImagem("src/Imagens/cavalo_com_borda_cinza.png", lblAguia));
        }
        else{
            lblCavalo.setIcon(LogicClass.addImagem("src/Imagens/cavalo_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCavaloMouseEntered

    private void lblCavaloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCavaloMouseExited
     Animal animal = new Animal("cavalo");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCavalo.setIcon(LogicClass.addImagem("src/Imagens/cavalo_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblCavalo.setIcon(LogicClass.addImagem("src/Imagens/cavalo_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCavaloMouseExited

    private void lblCobraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCobraMouseEntered
       Animal animal = new Animal("cobra");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCobra.setIcon(LogicClass.addImagem("src/Imagens/cobra_com_borda_cinza.png", lblAguia));
        }
        else{
            lblCobra.setIcon(LogicClass.addImagem("src/Imagens/cobra_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCobraMouseEntered

    private void lblCobraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCobraMouseExited
       Animal animal = new Animal("cobra");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCobra.setIcon(LogicClass.addImagem("src/Imagens/cobra_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblCobra.setIcon(LogicClass.addImagem("src/Imagens/cobra_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCobraMouseExited

    private void lblCoelhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCoelhoMouseEntered
        Animal animal = new Animal("coelho");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCoelho.setIcon(LogicClass.addImagem("src/Imagens/coelho_com_borda_cinza.png", lblAguia));
        }
        else{
            lblCoelho.setIcon(LogicClass.addImagem("src/Imagens/coelho_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCoelhoMouseEntered

    private void lblCoelhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCoelhoMouseExited
       Animal animal = new Animal("coelho");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblCoelho.setIcon(LogicClass.addImagem("src/Imagens/coelho_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblCoelho.setIcon(LogicClass.addImagem("src/Imagens/coelho_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblCoelhoMouseExited

    private void lblElefanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElefanteMouseEntered
       Animal animal = new Animal("elefante");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblElefante.setIcon(LogicClass.addImagem("src/Imagens/elefante_com_borda_cinza.png", lblAguia));
        }
        else{
            lblElefante.setIcon(LogicClass.addImagem("src/Imagens/elefante_com_borda.png", lblAguia));
        } 
    }//GEN-LAST:event_lblElefanteMouseEntered

    private void lblElefanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElefanteMouseExited
        Animal animal = new Animal("elefante");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblElefante.setIcon(LogicClass.addImagem("src/Imagens/elefante_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblElefante.setIcon(LogicClass.addImagem("src/Imagens/elefante_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblElefanteMouseExited

    private void lblGaloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGaloMouseEntered
       Animal animal = new Animal("galo");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblGalo.setIcon(LogicClass.addImagem("src/Imagens/galo_com_borda_cinza.png", lblAguia));
        }
        else{
            lblGalo.setIcon(LogicClass.addImagem("src/Imagens/galo_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblGaloMouseEntered

    private void lblGaloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGaloMouseExited
        Animal animal = new Animal("galo");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblGalo.setIcon(LogicClass.addImagem("src/Imagens/galo_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblGalo.setIcon(LogicClass.addImagem("src/Imagens/galo_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblGaloMouseExited

    private void lblGatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGatoMouseEntered
       Animal animal = new Animal("gato");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblGato.setIcon(LogicClass.addImagem("src/Imagens/gato_com_borda_cinza.png", lblAguia));
        }
        else{
            lblGato.setIcon(LogicClass.addImagem("src/Imagens/gato_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblGatoMouseEntered

    private void lblGatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGatoMouseExited
        Animal animal = new Animal("gato");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblGato.setIcon(LogicClass.addImagem("src/Imagens/gato_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblGato.setIcon(LogicClass.addImagem("src/Imagens/gato_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblGatoMouseExited

    private void lblJacareMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJacareMouseEntered
        Animal animal = new Animal("jacare");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblJacare.setIcon(LogicClass.addImagem("src/Imagens/jacare_com_borda_cinza.png", lblAguia));
        }
        else{
            lblJacare.setIcon(LogicClass.addImagem("src/Imagens/jacare_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblJacareMouseEntered

    private void lblJacareMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJacareMouseExited
        Animal animal = new Animal("jacare");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblJacare.setIcon(LogicClass.addImagem("src/Imagens/jacare_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblJacare.setIcon(LogicClass.addImagem("src/Imagens/jacare_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblJacareMouseExited

    private void lblLeaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLeaoMouseEntered
       Animal animal = new Animal("leao");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblLeao.setIcon(LogicClass.addImagem("src/Imagens/leao_com_borda_cinza.png", lblAguia));
        }
        else{
            lblLeao.setIcon(LogicClass.addImagem("src/Imagens/leao_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblLeaoMouseEntered

    private void lblLeaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLeaoMouseExited
        Animal animal = new Animal("leao");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblLeao.setIcon(LogicClass.addImagem("src/Imagens/leao_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblLeao.setIcon(LogicClass.addImagem("src/Imagens/leao_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblLeaoMouseExited

    private void lblMacacoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMacacoMouseEntered
        Animal animal = new Animal("macaco");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblMacaco.setIcon(LogicClass.addImagem("src/Imagens/macaco_com_borda_cinza.png", lblAguia));
        }
        else{
            lblMacaco.setIcon(LogicClass.addImagem("src/Imagens/macaco_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblMacacoMouseEntered

    private void lblMacacoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMacacoMouseExited
       Animal animal = new Animal("macaco");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblMacaco.setIcon(LogicClass.addImagem("src/Imagens/macaco_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblMacaco.setIcon(LogicClass.addImagem("src/Imagens/macaco_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblMacacoMouseExited

    private void lblPatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPatoMouseEntered
       Animal animal = new Animal("pato");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblPato.setIcon(LogicClass.addImagem("src/Imagens/pato_com_borda_cinza.png", lblAguia));
        }
        else{
            lblPato.setIcon(LogicClass.addImagem("src/Imagens/pato_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblPatoMouseEntered

    private void lblPatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPatoMouseExited
       Animal animal = new Animal("pato");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblPato.setIcon(LogicClass.addImagem("src/Imagens/pato_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblPato.setIcon(LogicClass.addImagem("src/Imagens/pato_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblPatoMouseExited

    private void lblPavaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPavaoMouseEntered
        Animal animal = new Animal("pavao");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblPavao.setIcon(LogicClass.addImagem("src/Imagens/pavao_com_borda_cinza.png", lblAguia));
        }
        else{
            lblPavao.setIcon(LogicClass.addImagem("src/Imagens/pavao_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblPavaoMouseEntered

    private void lblPavaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPavaoMouseExited
       Animal animal = new Animal("pavao");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblPavao.setIcon(LogicClass.addImagem("src/Imagens/pavao_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblPavao.setIcon(LogicClass.addImagem("src/Imagens/pavao_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblPavaoMouseExited

    private void lblPicaPauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPicaPauMouseEntered
        Animal animal = new Animal("pica_pau");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblPicaPau.setIcon(LogicClass.addImagem("src/Imagens/pica_pau_com_borda_cinza.png", lblAguia));
        }
        else{
            lblPicaPau.setIcon(LogicClass.addImagem("src/Imagens/pica_pau_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblPicaPauMouseEntered

    private void lblPicaPauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPicaPauMouseExited
      Animal animal = new Animal("pica_pau");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblPicaPau.setIcon(LogicClass.addImagem("src/Imagens/pica_pau_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblPicaPau.setIcon(LogicClass.addImagem("src/Imagens/pica_pau_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblPicaPauMouseExited

    private void lblPorcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPorcoMouseEntered
       Animal animal = new Animal("porco");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblPorco.setIcon(LogicClass.addImagem("src/Imagens/porco_com_borda_cinza.png", lblAguia));
        }
        else{
            lblPorco.setIcon(LogicClass.addImagem("src/Imagens/porco_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblPorcoMouseEntered

    private void lblPorcoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPorcoMouseExited
        Animal animal = new Animal("porco");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblPorco.setIcon(LogicClass.addImagem("src/Imagens/porco_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblPorco.setIcon(LogicClass.addImagem("src/Imagens/porco_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblPorcoMouseExited

    private void lblTigreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTigreMouseEntered
       Animal animal = new Animal("tigre");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblTigre.setIcon(LogicClass.addImagem("src/Imagens/tigre_com_borda_cinza.png", lblAguia));
        }
        else{
            lblTigre.setIcon(LogicClass.addImagem("src/Imagens/tigre_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblTigreMouseEntered

    private void lblTigreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTigreMouseExited
        Animal animal = new Animal("tigre");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblTigre.setIcon(LogicClass.addImagem("src/Imagens/tigre_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblTigre.setIcon(LogicClass.addImagem("src/Imagens/tigre_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblTigreMouseExited

    private void lblTouroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTouroMouseEntered
        Animal animal = new Animal("touro");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblTouro.setIcon(LogicClass.addImagem("src/Imagens/touro_com_borda_cinza.png", lblAguia));
        }
        else{
            lblTouro.setIcon(LogicClass.addImagem("src/Imagens/touro_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblTouroMouseEntered

    private void lblTouroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTouroMouseExited
      Animal animal = new Animal("touro");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblTouro.setIcon(LogicClass.addImagem("src/Imagens/touro_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblTouro.setIcon(LogicClass.addImagem("src/Imagens/touro_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblTouroMouseExited

    private void lblUrsoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUrsoMouseEntered
       Animal animal = new Animal("urso");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblUrso.setIcon(LogicClass.addImagem("src/Imagens/urso_com_borda_cinza.png", lblAguia));
        }
        else{
            lblUrso.setIcon(LogicClass.addImagem("src/Imagens/urso_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblUrsoMouseEntered

    private void lblUrsoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUrsoMouseExited
       Animal animal = new Animal("urso");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblUrso.setIcon(LogicClass.addImagem("src/Imagens/urso_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblUrso.setIcon(LogicClass.addImagem("src/Imagens/urso_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblUrsoMouseExited

    private void lblVacaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVacaMouseEntered
       Animal animal = new Animal("vaca");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblVaca.setIcon(LogicClass.addImagem("src/Imagens/vaca_com_borda_cinza.png", lblAguia));
        }
        else{
            lblVaca.setIcon(LogicClass.addImagem("src/Imagens/vaca_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblVacaMouseEntered

    private void lblVacaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVacaMouseExited
       Animal animal = new Animal("vaca");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblVaca.setIcon(LogicClass.addImagem("src/Imagens/vaca_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblVaca.setIcon(LogicClass.addImagem("src/Imagens/vaca_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblVacaMouseExited

    private void lblVeadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVeadoMouseEntered
       Animal animal = new Animal("veado");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblVeado.setIcon(LogicClass.addImagem("src/Imagens/veado_com_borda_cinza.png", lblAguia));
        }
        else{
            lblVeado.setIcon(LogicClass.addImagem("src/Imagens/veado_com_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblVeadoMouseEntered

    private void lblVeadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVeadoMouseExited
        Animal animal = new Animal("veado");
        if(LogicClass.tem_no_array(animal, this.animais_escolhidos)){
            lblVeado.setIcon(LogicClass.addImagem("src/Imagens/veado_sem_borda_cinza.png", lblAguia));
        }
        else{
            lblVeado.setIcon(LogicClass.addImagem("src/Imagens/veado_sem_borda.png", lblAguia));
        }
    }//GEN-LAST:event_lblVeadoMouseExited

    private void lblAguiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAguiaMouseClicked
        Animal animal = new Animal("aguia");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblAguia.setIcon(LogicClass.addImagem("src/Imagens/aguia_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblAguiaMouseClicked

    private void lblAvestruzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvestruzMouseClicked
        Animal animal = new Animal("avestruz");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblAvestruz.setIcon(LogicClass.addImagem("src/Imagens/avestruz_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblAvestruzMouseClicked

    private void lblBorboletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorboletaMouseClicked
       Animal animal = new Animal("borboleta");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblBorboleta.setIcon(LogicClass.addImagem("src/Imagens/borboleta_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblBorboletaMouseClicked

    private void lblBurroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBurroMouseClicked
        Animal animal = new Animal("burro");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblBurro.setIcon(LogicClass.addImagem("src/Imagens/burro_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblBurroMouseClicked

    private void lblCachorroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCachorroMouseClicked
       Animal animal = new Animal("cachorro");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblCachorro.setIcon(LogicClass.addImagem("src/Imagens/cachorro_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblCachorroMouseClicked

    private void lblCameloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCameloMouseClicked
        Animal animal = new Animal("camelo");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblCamelo.setIcon(LogicClass.addImagem("src/Imagens/camelo_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblCameloMouseClicked

    private void lblCarneiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarneiroMouseClicked
        Animal animal = new Animal("carneiro");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblCarneiro.setIcon(LogicClass.addImagem("src/Imagens/carneiro_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblCarneiroMouseClicked

    private void lblCavaloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCavaloMouseClicked
        Animal animal = new Animal("cavalo");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblCavalo.setIcon(LogicClass.addImagem("src/Imagens/cavalo_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblCavaloMouseClicked

    private void lblCobraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCobraMouseClicked
        Animal animal = new Animal("cobra");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblCobra.setIcon(LogicClass.addImagem("src/Imagens/cobra_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblCobraMouseClicked

    private void lblCoelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCoelhoMouseClicked
        Animal animal = new Animal("coelho");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblCoelho.setIcon(LogicClass.addImagem("src/Imagens/coelho_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblCoelhoMouseClicked

    private void lblElefanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElefanteMouseClicked
        Animal animal = new Animal("elefante");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblElefante.setIcon(LogicClass.addImagem("src/Imagens/elefante_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblElefanteMouseClicked

    private void lblGaloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGaloMouseClicked
        Animal animal = new Animal("galo");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblGalo.setIcon(LogicClass.addImagem("src/Imagens/galo_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblGaloMouseClicked

    private void lblGatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGatoMouseClicked
        Animal animal = new Animal("gato");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblGato.setIcon(LogicClass.addImagem("src/Imagens/gato_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblGatoMouseClicked

    private void lblJacareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJacareMouseClicked
       Animal animal = new Animal("jacare");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblJacare.setIcon(LogicClass.addImagem("src/Imagens/jacare_com_borda_cinza.png", lblAguia));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblJacareMouseClicked

    private void lblLeaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLeaoMouseClicked
        Animal animal = new Animal("leao");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblLeao.setIcon(LogicClass.addImagem("src/Imagens/leao_com_borda_cinza.png", lblLeao));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblLeaoMouseClicked

    private void lblMacacoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMacacoMouseClicked
       Animal animal = new Animal("macaco");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblMacaco.setIcon(LogicClass.addImagem("src/Imagens/macaco_com_borda_cinza.png", lblLeao));
                this.animais_escolhidos.add(animal);
            }
        }  
    }//GEN-LAST:event_lblMacacoMouseClicked

    private void lblPatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPatoMouseClicked
        Animal animal = new Animal("pato");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblPato.setIcon(LogicClass.addImagem("src/Imagens/pato_com_borda_cinza.png", lblLeao));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblPatoMouseClicked

    private void lblPavaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPavaoMouseClicked
      Animal animal = new Animal("pavao");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblPavao.setIcon(LogicClass.addImagem("src/Imagens/pavao_com_borda_cinza.png", lblLeao));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblPavaoMouseClicked

    private void lblPicaPauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPicaPauMouseClicked
       Animal animal = new Animal("pica_pau");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblPicaPau.setIcon(LogicClass.addImagem("src/Imagens/pica_pau_com_borda_cinza.png", lblLeao));
                this.animais_escolhidos.add(animal);
            }
        }
    }//GEN-LAST:event_lblPicaPauMouseClicked

    private void lblPorcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPorcoMouseClicked
        Animal animal = new Animal("porco");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblPorco.setIcon(LogicClass.addImagem("src/Imagens/porco_com_borda_cinza.png", lblLeao));
                this.animais_escolhidos.add(animal);
            }
        }    
    }//GEN-LAST:event_lblPorcoMouseClicked

    private void lblTigreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTigreMouseClicked
       Animal animal = new Animal("tigre");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblTigre.setIcon(LogicClass.addImagem("src/Imagens/tigre_com_borda_cinza.png", lblLeao));
                this.animais_escolhidos.add(animal);
            }
        }   
    }//GEN-LAST:event_lblTigreMouseClicked

    private void lblTouroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTouroMouseClicked
        Animal animal = new Animal("touro");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblTouro.setIcon(LogicClass.addImagem("src/Imagens/touro_com_borda_cinza.png", lblLeao));
                this.animais_escolhidos.add(animal);
            }
        }   
    }//GEN-LAST:event_lblTouroMouseClicked

    private void lblUrsoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUrsoMouseClicked
       Animal animal = new Animal("urso");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblUrso.setIcon(LogicClass.addImagem("src/Imagens/urso_com_borda_cinza.png", lblLeao));
                this.animais_escolhidos.add(animal);
            }
        }   
    }//GEN-LAST:event_lblUrsoMouseClicked

    private void lblVacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVacaMouseClicked
        Animal animal = new Animal("vaca");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblVaca.setIcon(LogicClass.addImagem("src/Imagens/vaca_com_borda_cinza.png", lblLeao));
                this.animais_escolhidos.add(animal);
            }
        }   
    }//GEN-LAST:event_lblVacaMouseClicked

    private void lblVeadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVeadoMouseClicked
        Animal animal = new Animal("veado");
        if(this.saldo_bichos != 0){
            this.saldo_bichos--;
            if(!LogicClass.tem_no_array(animal, animais_escolhidos)){
                this.lblAnimaisDisponiveis.setText("Esolhas Disponíveis: "+Integer.toString(this.saldo_bichos));
                Principal.audios.selecionarMusica("mouse");
                lblVeado.setIcon(LogicClass.addImagem("src/Imagens/veado_com_borda_cinza.png", lblLeao));
                this.animais_escolhidos.add(animal);
            }
        }   
    }//GEN-LAST:event_lblVeadoMouseClicked

    private void lblApostar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApostar1MouseEntered
       lblApostar1.setIcon(LogicClass.addImagem("src/Imagens/btn_sortear_com_borda.png", lblApostar1));
    }//GEN-LAST:event_lblApostar1MouseEntered

    private void lblApostar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApostar1MouseExited
        lblApostar1.setIcon(LogicClass.addImagem("src/Imagens/btn_sortear_sem_borda.png", lblApostar1));
    }//GEN-LAST:event_lblApostar1MouseExited

    private void lblApostar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApostar1MouseClicked
        Principal.audios.selecionarMusica("mouse");
        if(this.saldo_bichos == 0){
            this.dispose();
            fazerAposta(this.jogador, this.dificuldade, this.animais_escolhidos, this.valor_aposta);
        }
        else{
           JOptionPane.showMessageDialog(null, "ZERE O SALDO DE BICHOS PARA APOSTAR"); 
        }
    }//GEN-LAST:event_lblApostar1MouseClicked

    private void lblSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseEntered
        lblSair.setIcon(LogicClass.addImagem("src/Imagens/btn_sair_com_borda.png", lblSair));
    }//GEN-LAST:event_lblSairMouseEntered

    private void lblSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseExited
      lblSair.setIcon(LogicClass.addImagem("src/Imagens/btn_sair_sem_borda.png", lblSair));
    }//GEN-LAST:event_lblSairMouseExited

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        Principal.audios.selecionarMusica("mouse");
        salvarDadosJogador(this.jogador);
        System.exit(0);
    }//GEN-LAST:event_lblSairMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceAposta(null, null, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAguia;
    private javax.swing.JLabel lblAnimaisDisponiveis;
    private javax.swing.JLabel lblApostar1;
    private javax.swing.JLabel lblAvestruz;
    private javax.swing.JLabel lblBorboleta;
    private javax.swing.JLabel lblBurro;
    private javax.swing.JLabel lblCachorro;
    private javax.swing.JLabel lblCamelo;
    private javax.swing.JLabel lblCarneiro;
    private javax.swing.JLabel lblCavalo;
    private javax.swing.JLabel lblCobra;
    private javax.swing.JLabel lblCoelho;
    private javax.swing.JLabel lblElefante;
    private javax.swing.JLabel lblGalo;
    private javax.swing.JLabel lblGato;
    private javax.swing.JLabel lblJacare;
    private javax.swing.JLabel lblLeao;
    private javax.swing.JLabel lblMacaco;
    private javax.swing.JLabel lblPato;
    private javax.swing.JLabel lblPavao;
    private javax.swing.JLabel lblPicaPau;
    private javax.swing.JLabel lblPorco;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSaldoDisponivel;
    private javax.swing.JLabel lblTigre;
    private javax.swing.JLabel lblTouro;
    private javax.swing.JLabel lblUrso;
    private javax.swing.JLabel lblVaca;
    private javax.swing.JLabel lblVeado;
    // End of variables declaration//GEN-END:variables
}
