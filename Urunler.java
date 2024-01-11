import java.security.PublicKey;
import java.util.Stack;
import java.util.Scanner;

public class Urunler {

    public static Urunler [] envanter = NoteBookEnvanterIslemleri.getNotebookEnvanterArray();
    public static Notebook envanter1 =  new Notebook("Envanter1",123414,15_000,64,2,14,10,Markalar.tumMarkalar[0],512 );
    public static Notebook envanter2 =  new Notebook("Envanter2",123244,15_000,64,2,14,10,Markalar.tumMarkalar[1],512 );
    public static Notebook envanter3 =  new Notebook("Envanter3",132344,15_000,64,2,14,10,Markalar.tumMarkalar[2],512 );
    public static Notebook envanter4 =  new Notebook("Envanter4",123444,15_000,64,2,14,10,Markalar.tumMarkalar[3],512 );
    public static Notebook envanter5 =  new Notebook("Envanter5",212344,15_000,64,2,14,10,Markalar.tumMarkalar[4],512 );
    public static Notebook envanter6 =  new Notebook("Envanter6",222445,15_000,64,2,14,10,Markalar.tumMarkalar[5],512 );

    public class  NoteBookEnvanterIslemleri {
        public static Notebook[] notebookEnvanterArray;
        static {
           Notebook [] notebookEnvanterArray = new Notebook[6];
              Notebook envanter1 =  new Notebook("Envanter1",123414,15_000,64,2,14,10,Markalar.tumMarkalar[0],512 );
              Notebook envanter2 =  new Notebook("Envanter2",123244,15_000,64,2,14,10,Markalar.tumMarkalar[1],512 );
             Notebook envanter3 =  new Notebook("Envanter3",132344,15_000,64,2,14,10,Markalar.tumMarkalar[2],512 );
             Notebook envanter4 =  new Notebook("Envanter4",123444,15_000,64,2,14,10,Markalar.tumMarkalar[3],512 );
             Notebook envanter5 =  new Notebook("Envanter5",212344,15_000,64,2,14,10,Markalar.tumMarkalar[4],512 );
             Notebook envanter6 =  new Notebook("Envanter6",222445,15_000,64,2,14,10,Markalar.tumMarkalar[5],512 );
            notebookEnvanterArray[0] = envanter1;
            notebookEnvanterArray[1] = envanter2;
            notebookEnvanterArray[2] = envanter3;
            notebookEnvanterArray[3] = envanter4;
            notebookEnvanterArray[4] = envanter5;
            notebookEnvanterArray[5] = envanter6;
        }
        public static Notebook[] getNotebookEnvanterArray() {
            return NoteBookEnvanterIslemleri.notebookEnvanterArray;
        }
    }
    private String urunAdi;
    private int urunId;
    private double urunFiyati;
    private int ramKapasite;
    private int stokNo;
    private double ekranInch;
    private double indirimOrani;
    private String MarkaBilgisi;

    protected Scanner input = new Scanner(System.in);

    public Urunler(String urunAdi, int urunId, double urunFiyati, int ramKapasite,
                   int stokNo, double ekranInch, double indirimOrani, String markaBilgisi) {
        this.urunAdi = urunAdi;
        this.urunId = urunId;
        this.urunFiyati = urunFiyati;
        this.ramKapasite = ramKapasite;
        this.stokNo = stokNo;
        this.ekranInch = ekranInch;
        this.indirimOrani = indirimOrani;
        MarkaBilgisi = markaBilgisi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public double getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(double urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public int getRamKapasite() {
        return ramKapasite;
    }

    public void setRamKapasite(int ramKapasite) {
        this.ramKapasite = ramKapasite;
    }

    public int getStokNo() {
        return stokNo;
    }

    public void setStokNo(int stokNo) {
        this.stokNo = stokNo;
    }

    public double getEkranInch() {
        return ekranInch;
    }

    public void setEkranInch(int ekranInch) {
        this.ekranInch = ekranInch;
    }

    public double getIndirimOrani() {
        return indirimOrani;
    }

    public void setIndirimOrani(double indirimOrani) {
        this.indirimOrani = indirimOrani;
    }

    public String getMarkaBilgisi() {
        return MarkaBilgisi;
    }

    public void setMarkaBilgisi(String markaBilgisi) {
        MarkaBilgisi = markaBilgisi;
    }

    public static void showMenu(){
        System.out.println(" 1- Ürünleri Listele");
        System.out.println("2 - Ürün ekle");
        System.out.println("3 - Ürün sil");
        System.out.println("4- Ürün grubunu seç");
        System.out.println("5- Ürünleri filtrele");
        System.out.println("0- Çıkış");
    }

    @Override
    public String toString() {
        return "Urunler{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunId=" + urunId +
                ", urunFiyati=" + urunFiyati +
                ", ramKapasite=" + ramKapasite +
                ", stokNo=" + stokNo +
                ", ekranInch=" + ekranInch +
                ", indirimOrani=" + indirimOrani +
                ", MarkaBilgisi='" + MarkaBilgisi + '\'' +
                '}';
    }

    public static String urunPrint(Notebook notebook) {
        return "Urun Bilgileri{" +
                "urun adı='" +  + '\'' +
                ", urun fiyatı=" + notebook.getUrunAdi() +
                ", marka bilgisi=" + notebook.getMarkaBilgisi() +
                ", ekran inch =" + notebook.getEkranInch() +
                ", stok No=" + notebook.getStokNo() +
                ", ram bilgisi=" + notebook.getRamKapasite() +
                ", indirim Orani=" + notebook.getIndirimOrani() +
                ", stok no ='" + notebook.getStokNo() + '\'' +
                '}';
    }

    public static void urunListele(){


            Notebook [] notebookEnvanterArray = new Notebook[6];
            Notebook envanter1 =  new Notebook("Envanter1",123414,15_000,64,2,14,10,Markalar.tumMarkalar[0],512 );
            Notebook envanter2 =  new Notebook("Envanter2",123244,15_000,64,2,14,10,Markalar.tumMarkalar[1],512 );
            Notebook envanter3 =  new Notebook("Envanter3",132344,15_000,64,2,14,10,Markalar.tumMarkalar[2],512 );
            Notebook envanter4 =  new Notebook("Envanter4",123444,15_000,64,2,14,10,Markalar.tumMarkalar[3],512 );
            Notebook envanter5 =  new Notebook("Envanter5",212344,15_000,64,2,14,10,Markalar.tumMarkalar[4],512 );
            Notebook envanter6 =  new Notebook("Envanter6",222445,15_000,64,2,14,10,Markalar.tumMarkalar[5],512 );
            notebookEnvanterArray[0] = envanter1;
            notebookEnvanterArray[1] = envanter2;
            notebookEnvanterArray[2] = envanter3;
            notebookEnvanterArray[3] = envanter4;
            notebookEnvanterArray[4] = envanter5;
            notebookEnvanterArray[5] = envanter6;

        for(Notebook book : notebookEnvanterArray ){
            urunPrint(book);
            System.out.println(Notebook.urunPrint(book));
        }

        envanter2.toString();
    }

    public  void menuIslemleri(){
        int menuSecim;
        outerloop:
        do {
            showMenu();
            System.out.print("Bir işlem seçiniz:  ");
            menuSecim = input.nextInt();

            switch (menuSecim){
                case 1:
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.println("Ürünleri listeleye tıkladınız");
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    urunListele();
                    System.out.print("Aradığınız Ürün mevcut mu? <E>vet  <H>ayır  ");
                    String seçim = input.nextLine().toUpperCase();
                    if(seçim == "E") System.out.print("Ne güzel");
                    else break outerloop;

                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.println("Ürün ekleye tıkladınız");
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.println("Ürün sil");
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.println("Ürün grubunu seç");
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    break;
                case 5:
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.println("Ürün filtrele");
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    break;

            }
        }while (menuSecim != 0);
    }
}
