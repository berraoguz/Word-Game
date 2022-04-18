package sample;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Timer;

public class Controller implements ActionListener {

    int sure = 240;
    boolean zamanAktif = true;
    Sorular sorular = new Sorular();
    SoruModel soru;
    int puan = 0;
    int acilanHarf;
    int soruSayisi = 0;
    HashMap<Integer,Boolean> acilanHarfIndex;
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
        sure--;
        Platform.runLater(()->{
        sureYaz();
        if (sure <= 0){
            oyunBitir();
        }
        });
        }
    };
    @FXML
    public void initialize() {
        oyunBittiLabel.setVisible(false);
        soruDegisEkranYaz();
    }

    Timer timer = new Timer(1000, actionListener);

    @FXML
    private Button harfAlButton;
    @FXML
    private Button tahminOnaylaButon;
    @FXML
    private Label kelimeLabel;

    @FXML
    private Label puanLabel;

    @FXML
    private Label soruLabel;

    @FXML
    private Label sureLabel;

    @FXML
    private Label soruSayisiLabel;

    @FXML
    private Label oyunBittiLabel;

    @FXML
    private TextField tahminInput;

    @FXML
    private Button zamanDurdurButton;

    @FXML
    private BorderPane soruPanel;

    @FXML
    void harfAl(ActionEvent event) {
        Random random = new Random(System.nanoTime());
        boolean dongu = true;
        while (dongu){
            int deger = random.nextInt(soru.getCevap().length());
            if (acilanHarfIndex.get(deger) == null || acilanHarfIndex.get(deger) != true) {
                dongu = false;
                acilanHarfIndex.put(deger,true);
                acilanHarf ++;
            }
        }
        if (acilanHarf == soru.getCevap().length()){
            soruDegisEkranYaz();
        } else {
            harfAcYaz();
        }

    }


    @FXML
    void zamanDurdur(ActionEvent event) {
        timer.stop();
        zamanAktif = false;
        zamanDurdurButton.setVisible(false);
        harfAlButton.setVisible(false);
        tahminOnaylaButon.setVisible(true);
    }

    @FXML
    void tahminOnayla(ActionEvent event){
        if(soru.getCevap().replaceAll("İ","I").equals(tahminInput.getText().toUpperCase())){
            puan = puan + ((soru.getCevap().length() - acilanHarf) * 100);
        } else {
            puan = puan - (soru.getCevap().length() * 100);
        }
        soruDegisEkranYaz();
    }

    public void sureYaz(){
        sureLabel.setText(sure+"");
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
    }

    public void oyunBitir(){
        oyunBittiLabel.setVisible(true);
        timer.stop();
        harfAlButton.setVisible(false);
        zamanDurdurButton.setVisible(false);
        tahminOnaylaButon.setVisible(false);
        soruPanel.setVisible(false);
        tahminInput.setVisible(false);
        kelimeLabel.setVisible(false);
    }

    public void soruDegisEkranYaz(){
        if (soruSayisi == 14){
            oyunBitir();
        } else {
            soru = sorular.getSoru();
            soruSayisi++;
            acilanHarfIndex = new HashMap<>();
            soruLabel.setText(soru.getSoru());
            harfAcYaz();
            puanLabel.setText(puan + "");
            tahminInput.setText(null);
            timer.start();
            acilanHarf = 0;
            zamanDurdurButton.setVisible(true);
            harfAlButton.setVisible(true);
            tahminOnaylaButon.setVisible(false);
            soruSayisiLabel.setText(soruSayisi + "");
        }
        }
    public void harfAcYaz(){
        String yazilacak ="";

            for (int i = 0; i < soru.getCevap().length(); i++ ){
                if (acilanHarfIndex.get(i) == null || acilanHarfIndex.get(i) != true){
                    yazilacak += "_ ";
                } else {
                    yazilacak += soru.getCevap().charAt(i) + " ";
                }

            }

        yazilacak = yazilacak.substring(0,yazilacak.length()-1);
        kelimeLabel.setText(yazilacak);
    }
}
