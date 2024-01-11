public class CepTelefonu extends Urunler {
    private int pilGucu;
    private String  renk;

    public static String [] renkSecenekleri = {"Siyah","Kirmizi","Mavi"};
    private int hafiza;


    public CepTelefonu(String urunAdi, int urunId, double urunFiyati, int ramKapasite, int stokNo, double ekranInch,
                       double indirimOrani, String markaBilgisi, int pilGucu, String renk,int hafiza) {
        super(urunAdi, urunId, urunFiyati, ramKapasite, stokNo, ekranInch, indirimOrani, markaBilgisi);
        this.pilGucu=pilGucu;
        this.renk=renk;
        this.hafiza=hafiza;
    }

    public int getPilGucu() {
        return pilGucu;
    }

    public void setPilGucu(int pilGucu) {
        this.pilGucu = pilGucu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getHafiza() {
        return hafiza;
    }

    public void setHafiza(int hafiza) {
        this.hafiza = hafiza;
    }


}
