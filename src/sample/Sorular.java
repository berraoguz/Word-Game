package sample;

import java.util.ArrayList;
import java.util.Random;

public class Sorular {

    private ArrayList <SoruModel> sorular = new ArrayList();

    public Sorular() {


        SoruModel soru = new SoruModel("Alt açıları eşit olan üçgenlerin kenarlarını niteleyen sıfat","İKİZ");
        sorular.add(soru);

        SoruModel soru1 = new SoruModel("Herhangi bir şeyi açıklamak için genellikle el, kol ve baş ile yapılan içgüdüsel veya iradeli hareket","JEST");
        sorular.add(soru1);

        SoruModel soru2 = new SoruModel("Bir olayda birbiri ardınca görülen her bir aşama","EVRE");
        sorular.add(soru2);

        SoruModel soru3 = new SoruModel("''Has'' ve ''mahsus'' sözlerinin Türkçe kökenli karşılığı","ÖZGÜ");
        sorular.add(soru3);

        SoruModel soru4 = new SoruModel("Çiçekli bitkilerin döllenme aracı olan toz","POLEN");
        sorular.add(soru4);

        SoruModel soru5 = new SoruModel("Birine veya bir şeye yüksek değer vermekten doğan duygu","SAYGI");
        sorular.add(soru5);

        SoruModel soru6 = new SoruModel("Burun küpesi","HIZMA");
        sorular.add(soru6);

        SoruModel soru7 = new SoruModel("Hazneli doğrayıcı","RONDO");
        sorular.add(soru7);

        SoruModel soru8 = new SoruModel("Otomobil alınıp satılan yer","GALERİ");
        sorular.add(soru8);

        SoruModel soru9 = new SoruModel("Saz şairi düellosu","ATIŞMA");
        sorular.add(soru9);

        SoruModel soru10 = new SoruModel("Hasır otları ve açık renkli kamışlarla dolu, su kıyılarındaki bataklık yer","SAZLIK");
        sorular.add(soru10);

        SoruModel soru11 = new SoruModel("Osmanlı Devleti'ne özgü askeri mızıka takımında görevli kişi","MEHTER");
        sorular.add(soru11);

        SoruModel soru12 = new SoruModel("''Gözaltı'' tabirinin eş anlamlısı","NEZARET");
        sorular.add(soru12);

        SoruModel soru13 = new SoruModel("''Hastalık oluşturan'' anlamındaki batı kökenli bir söz","PATOJEN");
        sorular.add(soru13);

        SoruModel soru14 = new SoruModel("Bedenin kemik çatısı","İSKELET");
        sorular.add(soru14);

        SoruModel soru15 = new SoruModel("Mecazi anlamda ''Belli bir yerin dışına itilme, uzaklaştırılma''","SÜRÜLME");
        sorular.add(soru15);

        SoruModel soru16 = new SoruModel("Topu potaya çarptırmadan yapılan atış","DELİKSİZ");
        sorular.add(soru16);

        SoruModel soru17 = new SoruModel("Telaş şikayet gibi durumları anlatan çığlık","HAYKIRIŞ");
        sorular.add(soru17);

        SoruModel soru18 = new SoruModel("Bir işin tamamlanması veya bir borcun ödenmesi için öngörülen sürenin bitiş tarihi","VADESONU");
        sorular.add(soru18);

        SoruModel soru19 = new SoruModel("Bir devletin egemenliği altında bulunan toprak bütünü","MEMLEKET");
        sorular.add(soru19);

        SoruModel soru20 = new SoruModel("Kepek ve taneciklerin bütünüyle öğütülmesiyle elde edilen un","TAMBUĞDAY");
        sorular.add(soru20);

        SoruModel soru21 = new SoruModel("Hangi tarihte sona ereceği bilinen zaman","SAYILIGÜN");
        sorular.add(soru21);

        SoruModel soru22 = new SoruModel("Mecazi anlamda ''Kötü sonuç doğuracak bir durumdan zarar görmeden kurtulmak''","SIYRILMAK");
        sorular.add(soru22);

        SoruModel soru23 = new SoruModel(" ''İlk ve acil yardım'' , ''acil tıp teknisyeni'' anlamlarında kullanılan yabancı kökenli bir terim","PARAMEDİK");
        sorular.add(soru23);

        SoruModel soru24 = new SoruModel("Sesi duymadan, ağız hareketlerinin anlattığını anlama","DUDAKOKUMA");
        sorular.add(soru24);

        SoruModel soru25 = new SoruModel("Birinden veya bir şeyden yardım beklemek","MEDETUMMAK");
        sorular.add(soru25);

        SoruModel soru26 = new SoruModel("İşleri istenilen biçime getirmek, düzene sokmak","YOLAKOYMAK");
        sorular.add(soru26);

        SoruModel soru27 = new SoruModel("İki tarafı uzaklaştırmak uğraşısı nedeniyle güç duruma düşürme","ARADAKALMAK");
        sorular.add(soru27);

    }


    public SoruModel getSoru(){
        Random random = new Random(System.nanoTime());
        SoruModel soru = sorular.get(random.nextInt(sorular.size()));
        sorular.remove(soru);
        return soru;
    }
}
