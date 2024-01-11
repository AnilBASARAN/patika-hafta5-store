public class Main {
    public static void main(String[] args) {

        System.out.println("Patika Store Hoşgeldiniz");

        Notebook laptop1 = new Notebook("Yeni Laptopum",12344,15_000,64,2,14,10,Markalar.tumMarkalar[1],512 );
        CepTelefonu cep1 = new CepTelefonu("Cepim",11423,25_000,64,2,6.1,10,"Apple",4000,CepTelefonu.renkSecenekleri[1],512);

        menuIslemleri();


        System.out.println("Calısıyormu");

    }

    private static void menuIslemleri() {
    }
}
