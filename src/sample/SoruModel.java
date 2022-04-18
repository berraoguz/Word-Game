package sample;

public class SoruModel {
    private String soru;
    private String cevap;

    public SoruModel(String soru, String cevap) {
        this.soru = soru;
        this.cevap = cevap;
    }

    public void degerAta(String soru, String cevap) {
        this.soru = soru;
        this.cevap = cevap;
    }

    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getCevap() {
        return cevap;
    }

    public void setCevap(String cevap) {
        this.cevap = cevap;
    }
}
