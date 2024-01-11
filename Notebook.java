public class Notebook extends Urunler{
    private int depolamaAlani;

    public Notebook(String urunAdi, int urunId, double urunFiyati, int ramKapasite, int stokNo, int ekranInch, double indirimOrani, String markaBilgisi,int depolamaAlani) {
        super(urunAdi, urunId, urunFiyati, ramKapasite, stokNo, ekranInch, indirimOrani, markaBilgisi);
        this.depolamaAlani = depolamaAlani;
    }

    public int getDepolamaAlani() {
        return depolamaAlani;
    }

    public void setDepolamaAlani(int depolamaAlani) {
        this.depolamaAlani = depolamaAlani;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "depolamaAlani=" + depolamaAlani +
                "} " ;
    }
}
